#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.extensions;
import com.venky.core.collections.IgnoreCaseMap;
import com.venky.core.util.ObjectUtil;
import com.venky.extension.Registry;
import in.succinct.beckn.Catalog;
import in.succinct.beckn.Intent;
import in.succinct.beckn.Item;
import in.succinct.beckn.Items;
import in.succinct.beckn.Location;
import in.succinct.beckn.Locations;
import in.succinct.beckn.Message;
import in.succinct.beckn.Order;
import in.succinct.beckn.Provider;
import in.succinct.beckn.Providers;
import in.succinct.beckn.Quote;
import in.succinct.beckn.Request;
import in.succinct.bpp.shell.extensions.BppActionExtension;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ECommerceExtension extends BppActionExtension {
    static {
        Registry.instance().registerExtension("in.succinct.bpp.shell.extension",new ECommerceExtension());
    }
    @Override
    public void search(Request request, Request reply) {
    }

    @Override
    public void select(Request request, Request response) {

    }

    @Override
    public void init(Request request, Request reply) {
    }

    @Override
    public void confirm(Request request, Request reply) {
    }

    @Override
    public void track(Request request, Request reply) {

    }

    @Override
    public void cancel(Request request, Request reply) {
    }

    @Override
    public void update(Request request, Request reply) {
    }

    @Override
    public void status(Request request, Request reply) {
    }

    @Override
    public void rating(Request request, Request reply) {

    }


    @Override
    public void support(Request request, Request reply) {

    }

    @Override
    public void get_cancellation_reasons(Request request, Request reply) {

    }

    @Override
    public void get_return_reasons(Request request, Request reply) {

    }

    @Override
    public void get_rating_categories(Request request, Request reply) {

    }

    @Override
    public void get_feedback_categories(Request request, Request reply) {

    }
}
