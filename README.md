# redis-pub-sub

Projeto NoSQL com Java usando Redis. É explorado o modelo não relacional por este adotado, o chave-valor.

Desde o básico do seu funcionamento através dos seus comandos mais usados, conhecendo assim as estruturas de dados a que o banco de dados da suporte.

Usando o seu principal driver (Jedis) aproveitando suas poderosas e eficientes capacidades.

Esta sendo utilizado o Spring Data Redis como framework para facilitar a manipulação do Redis.

Recursos explorados:

- Publicação e assinatura

Pequeno exemplo que mostra uma simples solução de mensageria onde uma editora de revista publica um revista no redis e atraves de assinatura no redis uma banca recebe a revista publicada. De forma transparente e feita serialização e deserialização da revista pelo Spring Data Redis e Jackson.
