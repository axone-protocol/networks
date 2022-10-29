<!-- generated file - do not edit -->
# 🔗 `{{ (datasource "genesis").chain_id }}`

![chain-id](https://img.shields.io/badge/chain%20id-{{ (datasource "genesis").chain_id | urlquery | strings.ReplaceAll "-" "--" }}-blue?style=for-the-badge)
![stability-unstable](https://img.shields.io/badge/stability-unstable-yellow.svg?style=for-the-badge)
![audience](https://img.shields.io/badge/audience-restricted-orange.svg?style=for-the-badge)
![genesis-time](https://img.shields.io/badge/{{ "⏰" | urlquery }}%20genesis%20time-{{ (datasource "genesis").genesis_time | urlquery | strings.ReplaceAll "-" "--" }}-red?style=for-the-badge)

The main development network, intended primarily for use by the OKP4 core team. This `devnet` functions as a "playground" for those looking to experiment with the protocol as a blockchain user, token holder, application developer or network validator.

This network is very unstable, and the whole blockchain can be reset, deleting all blocks.
