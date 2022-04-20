// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WorkflowTemplateJobPigJobQueryListGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobPigJobQueryListGetArgs Empty = new WorkflowTemplateJobPigJobQueryListGetArgs();

    /**
     * Required. The queries to execute. You do not need to end a query expression with a semicolon. Multiple queries can be specified in one string by separating each with a semicolon. Here is an example of a Dataproc API snippet that uses a QueryList to specify a HiveJob: &#34;hiveJob&#34;: { &#34;queryList&#34;: { &#34;queries&#34;: } }
     * 
     */
    @Import(name="queries", required=true)
      private final Output<List<String>> queries;

    public Output<List<String>> queries() {
        return this.queries;
    }

    public WorkflowTemplateJobPigJobQueryListGetArgs(Output<List<String>> queries) {
        this.queries = Objects.requireNonNull(queries, "expected parameter 'queries' to be non-null");
    }

    private WorkflowTemplateJobPigJobQueryListGetArgs() {
        this.queries = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobPigJobQueryListGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> queries;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobPigJobQueryListGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queries = defaults.queries;
        }

        public Builder queries(Output<List<String>> queries) {
            this.queries = Objects.requireNonNull(queries);
            return this;
        }
        public Builder queries(List<String> queries) {
            this.queries = Output.of(Objects.requireNonNull(queries));
            return this;
        }
        public Builder queries(String... queries) {
            return queries(List.of(queries));
        }        public WorkflowTemplateJobPigJobQueryListGetArgs build() {
            return new WorkflowTemplateJobPigJobQueryListGetArgs(queries);
        }
    }
}
