package gkk.app.android.blockloper.common

object Config {

    /** 엔드포인트 URL (기본값: KAS 제공 메인넷) */
    var ENDPOINT_URL = EndpointNodeUrl.Cypress.KAS
    var CHAIN_ID = ChainId.CYPRESS
    var SCOPE_URL = ScopeUrl.Cypress.KLAYTN_FINDER


    /**
     * 퍼블릭 엔드포인트 노드
     * https://ko.docs.klaytn.foundation/dapp/json-rpc/public-en
     */
    object EndpointNodeUrl {
        object Cypress {
            const val KAS = "https://public-node-api.klaytnapi.com/v1/cypress"
            const val FANTRIE_1 = "https://klaytn01.fandom.finance"
            const val FANTRIE_2 = "https://klaytn02.fandom.finance"
            const val FANTRIE_3 = "https://klaytn03.fandom.finance"
            const val FANTRIE_4 = "https://klaytn04.fandom.finance"
            const val FANTRIE_5 = "https://klaytn05.fandom.finance"
            val LIST = listOf(
                KAS,
                FANTRIE_1,
                FANTRIE_2,
                FANTRIE_3,
                FANTRIE_4,
                FANTRIE_5,
            )
        }
        object Baobab {
            const val KAS = "https://public-node-api.klaytnapi.com/v1/baobab"
            const val KLAYTN_FOUNDATION = "https://api.baobab.klaytn.net:8651"
            val LIST = listOf(
                KAS,
                KLAYTN_FOUNDATION
            )
        }
    }

    /**
     * 체인 ID
     */
    object ChainId {
        const val CYPRESS = 8217
        const val BAOBAB = 1001
    }


    /**
     * 스코프 사이트 URL
     */
    object ScopeUrl {
        object Cypress {
            const val KLAYTN_FINDER = "https://klaytnfinder.io/"
            const val KLAYTN_SCOPE = "https://scope.klaytn.com/"
            val LIST = listOf(
                KLAYTN_FINDER,
                KLAYTN_SCOPE
            )
        }
        object Baobab {
            const val KLAYTN_FINDER = "https://baobab.klaytnfinder.io/"
            const val KLAYTN_SCOPE = "https://baobab.scope.klaytn.com/"
            val LIST = listOf(
                KLAYTN_FINDER,
                KLAYTN_SCOPE,
            )
        }
    }

}