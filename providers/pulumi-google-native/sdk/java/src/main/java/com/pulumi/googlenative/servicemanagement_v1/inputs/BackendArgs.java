// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.servicemanagement_v1.inputs.BackendRuleArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * `Backend` defines the backend configuration for a service.
 * 
 */
public final class BackendArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendArgs Empty = new BackendArgs();

    /**
     * A list of API backend rules that apply to individual API methods. **NOTE:** All service configuration rules follow &#34;last one wins&#34; order.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<BackendRuleArgs>> rules;

    public Output<List<BackendRuleArgs>> rules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    public BackendArgs(@Nullable Output<List<BackendRuleArgs>> rules) {
        this.rules = rules;
    }

    private BackendArgs() {
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<BackendRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(@Nullable Output<List<BackendRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<BackendRuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(BackendRuleArgs... rules) {
            return rules(List.of(rules));
        }        public BackendArgs build() {
            return new BackendArgs(rules);
        }
    }
}
