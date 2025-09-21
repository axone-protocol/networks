[![axone github banner](https://raw.githubusercontent.com/axone-protocol/.github/main/profile/static/axone-banner.png)](https://axone.xyz)

# 🌐 Axone Networks

> Genesis and node configuration elements for joining [Axone networks](https://docs.axone.xyz/docs/nodes/introduction).

[![lint](https://img.shields.io/github/actions/workflow/status/axone-protocol/networks/lint.yml?label=Lint&style=for-the-badge&logo=github)](https://github.com/axone-protocol/networks/actions/workflows/lint.yml)
[![conventional commits](https://img.shields.io/badge/Conventional%20Commits-1.0.0-yellow.svg?style=for-the-badge&logo=conventionalcommits)](https://conventionalcommits.org)
[![license](https://img.shields.io/badge/License-BSD_3--Clause-blue.svg?style=for-the-badge)](https://opensource.org/licenses/BSD-3-Clause)

This repository contains the official genesis files and network information for the various [Axone](https://axone.xyz) networks. Additionally, you'll find for each network, the instructions to register your validator node in the genesis, if applicable.

For a complete description about nodes and validators, check out the [Axone Documentation site](https://docs.axone.xyz/docs/nodes/introduction).

## 🔗 Networks

Below is the list of networks, grouped by status.

### 🟢 Active

- [![axone-1 mainnet](https://img.shields.io/badge/dynamic/json?style=for-the-badge&labelColor=steelblue&color=lightcyan&label=🟢%20axone%20mainnet&query=%24.block.header.height&url=https%3A%2F%2Faxone-api.highstakes.ch%2Fcosmos%2Fbase%2Ftendermint%2Fv1beta1%2Fblocks%2Flatest)](./chains/1/README.md)
- [![axone-dendrite-2 testnet](https://img.shields.io/badge/dynamic/json?style=for-the-badge&labelColor=teal&color=lightcyan&label=🟢%20axone-dendrite-2-%20testnet&query=%24.block.header.height&url=https%3A%2F%2Faxone-test.api.cumulo.com.es%2Fcosmos%2Fbase%2Ftendermint%2Fv1beta1%2Fblocks%2Flatest)](./chains/dendrite-2/README.md)

### 💤 Deprecated / Inactive

- [`dentrite-1`](./chains/dentrite-1/README.md)
- [`drunemeton-1`](./chains/drunemeton-1/README.md)
- [`nemeton-1`](./chains/nemeton-1/README.md)
- [`nemeton`](./chains/nemeton/README.md)
- [`devnet-1`](./chains/devnet-1/README.md)

## 👨‍⚖️ Want to become a validator?

Validators are responsible for securing the Axone network. Validator responsibilities include maintaining a functional [node](https://docs.axone.xyz/docs/nodes/run-node) with constant uptime and providing a sufficient amount of $AXONE as stake. In exchange for this service, validators receive block rewards and transaction fees!

So, want to become a validator?

<p align="center">👉 <a href="https://docs.axone.xyz/docs/nodes/introduction">Checkout the documentation!</a></p>

And Join the community!

<p align="center">
  <a href="https://discord.gg/axone"><img src="/docs/discord.svg" width="64" /></a>
  &nbsp; &nbsp;
  <a href="https://t.me/okp4network"><img src="/docs/telegram.svg" width="64" /></a>
</p>
