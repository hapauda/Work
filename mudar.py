import os

# Caminho da pasta com os arquivos
folder_path = r"C:\Users\vieir\Documents\primeiro test\Trabalho\nomes"

# Loop pelos arquivos da pasta
for i, nomes in enumerate(os.listdir(folder_path)):
    # Novo nome do arquivo
    new_name = f"arquivo_{i+1}.txt"
    # Caminhos completo do antigo e novo arquivo
    old_file = os.path.join(folder_path, nomes)
    new_file = os.path.join(folder_path, new_name)
    # Renomear o arquivo
    os.rename(old_file, new_file)
    print(f"{nomes} renomeado para {new_name}")