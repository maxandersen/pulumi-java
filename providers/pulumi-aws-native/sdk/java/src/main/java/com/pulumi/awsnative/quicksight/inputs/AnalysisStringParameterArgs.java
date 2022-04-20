// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * &lt;p&gt;A string parameter.&lt;/p&gt;
 * 
 */
public final class AnalysisStringParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalysisStringParameterArgs Empty = new AnalysisStringParameterArgs();

    /**
     * &lt;p&gt;A display name for a string parameter.&lt;/p&gt;
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * &lt;p&gt;The values of a string parameter.&lt;/p&gt;
     * 
     */
    @Import(name="values", required=true)
      private final Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    public AnalysisStringParameterArgs(
        Output<String> name,
        Output<List<String>> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private AnalysisStringParameterArgs() {
        this.name = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisStringParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalysisStringParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder values(Output<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Output.of(Objects.requireNonNull(values));
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public AnalysisStringParameterArgs build() {
            return new AnalysisStringParameterArgs(name, values);
        }
    }
}
