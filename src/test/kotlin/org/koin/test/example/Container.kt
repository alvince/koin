package org.koin.test.example

import org.koin.test.ServiceA
import org.koin.test.ServiceB
import org.koin.test.ServiceC

/**
 * Created by arnaud on 20/04/2017.
 */

object Container {
    val serviceA: ServiceA by lazy { ServiceA(serviceB) }
    val serviceB: ServiceB by lazy { ServiceB() }
    val serviceC: ServiceC by lazy { ServiceC(serviceA, serviceB) }
}