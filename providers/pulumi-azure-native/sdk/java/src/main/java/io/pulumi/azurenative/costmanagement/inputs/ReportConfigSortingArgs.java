// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The order by expression to be used in the report.
 * 
 */
public final class ReportConfigSortingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportConfigSortingArgs Empty = new ReportConfigSortingArgs();

    /**
     * Direction of sort.
     * 
     */
    @Import(name="direction")
      private final @Nullable Output<String> direction;

    public Output<String> direction() {
        return this.direction == null ? Codegen.empty() : this.direction;
    }

    /**
     * The name of the column to sort.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    public ReportConfigSortingArgs(
        @Nullable Output<String> direction,
        Output<String> name) {
        this.direction = direction;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ReportConfigSortingArgs() {
        this.direction = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigSortingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> direction;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigSortingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.name = defaults.name;
        }

        public Builder direction(@Nullable Output<String> direction) {
            this.direction = direction;
            return this;
        }
        public Builder direction(@Nullable String direction) {
            this.direction = Codegen.ofNullable(direction);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public ReportConfigSortingArgs build() {
            return new ReportConfigSortingArgs(direction, name);
        }
    }
}
