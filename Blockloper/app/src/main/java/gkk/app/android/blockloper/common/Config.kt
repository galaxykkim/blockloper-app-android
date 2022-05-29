package gkk.app.android.blockloper.common

object Config {

    /**
     * 퍼블릭 엔드포인트 노드
     * https://ko.docs.klaytn.foundation/dapp/json-rpc/public-en
     */
    object EndpointNodeUrl {
        /**
         * 메인넷 (사이프러스)
         */
        object Cypress {
            val LIST = listOf(
                "https://public-node-api.klaytnapi.com/v1/cypress",
                "https://klaytn01.fandom.finance",
                "https://klaytn02.fandom.finance",
                "https://klaytn03.fandom.finance",
                "https://klaytn04.fandom.finance",
                "https://klaytn05.fandom.finance",
            )
            val KAS = LIST[0]
            val FANTRIE_1 = LIST[1]
            val FANTRIE_2 = LIST[2]
            val FANTRIE_3 = LIST[3]
            val FANTRIE_4 = LIST[4]
            val FANTRIE_5 = LIST[5]
        }

        /**
         * 테스트넷 (바오밥)
         */
        object Baobab {
            val LIST = listOf(
                "https://public-node-api.klaytnapi.com/v1/baobab",
                "https://api.baobab.klaytn.net:8651",
            )
            val KAS = LIST[0]
            val KLAYTN_FOUNDATION = LIST[1]
        }
    }
}