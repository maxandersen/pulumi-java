// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class QueryListResponse {
    /**
     * The queries to execute. You do not need to end a query expression with a semicolon. Multiple queries can be specified in one string by separating each with a semicolon. Here is an example of a Dataproc API snippet that uses a QueryList to specify a HiveJob: &#34;hiveJob&#34;: { &#34;queryList&#34;: { &#34;queries&#34;: [ &#34;query1&#34;, &#34;query2&#34;, &#34;query3;query4&#34;, ] } }
     * 
     */
    private final List<String> queries;

    @CustomType.Constructor
    private QueryListResponse(@CustomType.Parameter("queries") List<String> queries) {
        this.queries = queries;
    }

    /**
     * The queries to execute. You do not need to end a query expression with a semicolon. Multiple queries can be specified in one string by separating each with a semicolon. Here is an example of a Dataproc API snippet that uses a QueryList to specify a HiveJob: &#34;hiveJob&#34;: { &#34;queryList&#34;: { &#34;queries&#34;: [ &#34;query1&#34;, &#34;query2&#34;, &#34;query3;query4&#34;, ] } }
     * 
    */
    public List<String> queries() {
        return this.queries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> queries;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queries = defaults.queries;
        }

        public Builder queries(List<String> queries) {
            this.queries = Objects.requireNonNull(queries);
            return this;
        }
        public Builder queries(String... queries) {
            return queries(List.of(queries));
        }        public QueryListResponse build() {
            return new QueryListResponse(queries);
        }
    }
}
