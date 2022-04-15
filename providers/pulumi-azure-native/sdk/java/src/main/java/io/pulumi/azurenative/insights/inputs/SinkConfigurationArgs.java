// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class SinkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SinkConfigurationArgs Empty = new SinkConfigurationArgs();

    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    public SinkConfigurationArgs(Output<String> kind) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private SinkConfigurationArgs() {
        this.kind = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SinkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(SinkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
        }

        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }        public SinkConfigurationArgs build() {
            return new SinkConfigurationArgs(kind);
        }
    }
}
