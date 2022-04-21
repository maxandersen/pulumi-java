// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A list of queries to run on a cluster.
 * 
 */
public final class QueryListArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueryListArgs Empty = new QueryListArgs();

    /**
     * The queries to execute. You do not need to end a query expression with a semicolon. Multiple queries can be specified in one string by separating each with a semicolon. Here is an example of a Dataproc API snippet that uses a QueryList to specify a HiveJob: &#34;hiveJob&#34;: { &#34;queryList&#34;: { &#34;queries&#34;: [ &#34;query1&#34;, &#34;query2&#34;, &#34;query3;query4&#34;, ] } }
     * 
     */
    @Import(name="queries", required=true)
    private Output<List<String>> queries;

    public Output<List<String>> queries() {
        return this.queries;
    }

    private QueryListArgs() {}

    private QueryListArgs(QueryListArgs $) {
        this.queries = $.queries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueryListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryListArgs $;

        public Builder() {
            $ = new QueryListArgs();
        }

        public Builder(QueryListArgs defaults) {
            $ = new QueryListArgs(Objects.requireNonNull(defaults));
        }

        public Builder queries(Output<List<String>> queries) {
            $.queries = queries;
            return this;
        }

        public Builder queries(List<String> queries) {
            return queries(Output.of(queries));
        }

        public Builder queries(String... queries) {
            return queries(List.of(queries));
        }

        public QueryListArgs build() {
            $.queries = Objects.requireNonNull($.queries, "expected parameter 'queries' to be non-null");
            return $;
        }
    }

}
