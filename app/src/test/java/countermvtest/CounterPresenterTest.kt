package countermvtest

import com.example.tp4_pil_mobile_basics_countermvp.mvp.CounterContract
import com.example.tp4_pil_mobile_basics_countermvp.mvp.CounterModel
import com.example.tp4_pil_mobile_basics_countermvp.mvp.CounterPresenter
import com.example.tp4_pil_mobile_basics_countermvp.mvp.CounterView
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockkClass
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class CounterPresenterTest {

    private lateinit var presenter: CounterContract.Presenter
    private val view = mockkClass(CounterView::class)


    @Before
    fun setUp(){
        presenter = CounterPresenter(CounterModel(), view)
        MockKAnnotations.init()
    }

    @Test
    fun onIncrementButtonTest(){

        presenter.onIncrementButton()
        verify { view.setCounter(any()) }
    }

    @Test
    fun onDecrementButtonTest(){

        presenter.onDecrementButton()
        verify { view.setCounter(any()) }
    }

}
