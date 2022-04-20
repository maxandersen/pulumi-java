// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableViewArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableViewArgs Empty = new TableViewArgs();

    /**
     * A query whose result is persisted.
     * 
     */
    @Import(name="query", required=true)
      private final Output<String> query;

    public Output<String> query() {
        return this.query;
    }

    /**
     * Specifies whether to use BigQuery&#39;s legacy SQL for this view.
     * The default value is true. If set to false, the view will use BigQuery&#39;s standard SQL.
     * 
     */
    @Import(name="useLegacySql")
      private final @Nullable Output<Boolean> useLegacySql;

    public Output<Boolean> useLegacySql() {
        return this.useLegacySql == null ? Codegen.empty() : this.useLegacySql;
    }

    public TableViewArgs(
        Output<String> query,
        @Nullable Output<Boolean> useLegacySql) {
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.useLegacySql = useLegacySql;
    }

    private TableViewArgs() {
        this.query = Codegen.empty();
        this.useLegacySql = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> query;
        private @Nullable Output<Boolean> useLegacySql;

        public Builder() {
    	      // Empty
        }

        public Builder(TableViewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.useLegacySql = defaults.useLegacySql;
        }

        public Builder query(Output<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder query(String query) {
            this.query = Output.of(Objects.requireNonNull(query));
            return this;
        }
        public Builder useLegacySql(@Nullable Output<Boolean> useLegacySql) {
            this.useLegacySql = useLegacySql;
            return this;
        }
        public Builder useLegacySql(@Nullable Boolean useLegacySql) {
            this.useLegacySql = Codegen.ofNullable(useLegacySql);
            return this;
        }        public TableViewArgs build() {
            return new TableViewArgs(query, useLegacySql);
        }
    }
}
