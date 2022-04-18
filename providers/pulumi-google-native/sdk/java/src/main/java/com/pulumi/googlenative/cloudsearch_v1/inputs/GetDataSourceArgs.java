// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDataSourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataSourceArgs Empty = new GetDataSourceArgs();

    @Import(name="datasourceId", required=true)
      private final String datasourceId;

    public String datasourceId() {
        return this.datasourceId;
    }

    @Import(name="debugOptionsEnableDebugging")
      private final @Nullable String debugOptionsEnableDebugging;

    public Optional<String> debugOptionsEnableDebugging() {
        return this.debugOptionsEnableDebugging == null ? Optional.empty() : Optional.ofNullable(this.debugOptionsEnableDebugging);
    }

    public GetDataSourceArgs(
        String datasourceId,
        @Nullable String debugOptionsEnableDebugging) {
        this.datasourceId = Objects.requireNonNull(datasourceId, "expected parameter 'datasourceId' to be non-null");
        this.debugOptionsEnableDebugging = debugOptionsEnableDebugging;
    }

    private GetDataSourceArgs() {
        this.datasourceId = null;
        this.debugOptionsEnableDebugging = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasourceId;
        private @Nullable String debugOptionsEnableDebugging;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasourceId = defaults.datasourceId;
    	      this.debugOptionsEnableDebugging = defaults.debugOptionsEnableDebugging;
        }

        public Builder datasourceId(String datasourceId) {
            this.datasourceId = Objects.requireNonNull(datasourceId);
            return this;
        }
        public Builder debugOptionsEnableDebugging(@Nullable String debugOptionsEnableDebugging) {
            this.debugOptionsEnableDebugging = debugOptionsEnableDebugging;
            return this;
        }        public GetDataSourceArgs build() {
            return new GetDataSourceArgs(datasourceId, debugOptionsEnableDebugging);
        }
    }
}
