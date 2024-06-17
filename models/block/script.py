import json
import os

def adjust_y_positions_in_file(file_path, adjustment):
    # Ouvrir et lire le fichier JSON
    with open(file_path, 'r') as file:
        data = json.load(file)
    
    # Fonction pour ajuster la valeur y dans les listes de coordonnées
    def adjust_y(coords):
        if len(coords) == 3:
            coords[1] += adjustment
        return coords
    
    # Parcourir les objets du fichier JSON et ajuster les valeurs y dans from et to
    for obj in data.get('elements', []):
        if 'from' in obj:
            obj['from'] = adjust_y(obj['from'])
        if 'to' in obj:
            obj['to'] = adjust_y(obj['to'])
    
    # Écrire les modifications dans le même fichier JSON
    with open(file_path, 'w') as file:
        json.dump(data, file, indent=4)

def adjust_y_positions_in_folder(folder_path, adjustment):
    # Parcourir tous les fichiers dans le dossier
    for filename in os.listdir(folder_path):
        # Vérifier si le fichier a l'extension .json
        if filename.endswith('.json'):
            file_path = os.path.join(folder_path, filename)
            adjust_y_positions_in_file(file_path, adjustment)
            print(f'Adjusted {filename}')

# Chemin du dossier contenant les fichiers JSON à modifier
folder_path = r'C:\Users\hugo\MCreatorWorkspaces\cit_importation_work\models\block'

# Ajustement de la valeur y
adjustment = -8

# Exécuter la fonction pour ajuster les positions y dans tous les fichiers JSON du dossier
adjust_y_positions_in_folder(folder_path, adjustment)
