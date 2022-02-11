// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeClassStrategyOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeClassStrategyOptionsArgs Empty = new RuntimeClassStrategyOptionsArgs();

    @InputImport(name="allowedRuntimeClassNames", required=true)
    private final Input<List<String>> allowedRuntimeClassNames;

    public Input<List<String>> getAllowedRuntimeClassNames() {
        return this.allowedRuntimeClassNames;
    }

    @InputImport(name="defaultRuntimeClassName")
    private final @Nullable Input<String> defaultRuntimeClassName;

    public Input<String> getDefaultRuntimeClassName() {
        return this.defaultRuntimeClassName == null ? Input.empty() : this.defaultRuntimeClassName;
    }

    public RuntimeClassStrategyOptionsArgs(
        Input<List<String>> allowedRuntimeClassNames,
        @Nullable Input<String> defaultRuntimeClassName) {
        this.allowedRuntimeClassNames = Objects.requireNonNull(allowedRuntimeClassNames, "expected parameter 'allowedRuntimeClassNames' to be non-null");
        this.defaultRuntimeClassName = defaultRuntimeClassName;
    }

    private RuntimeClassStrategyOptionsArgs() {
        this.allowedRuntimeClassNames = Input.empty();
        this.defaultRuntimeClassName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeClassStrategyOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> allowedRuntimeClassNames;
        private @Nullable Input<String> defaultRuntimeClassName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeClassStrategyOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRuntimeClassNames = defaults.allowedRuntimeClassNames;
    	      this.defaultRuntimeClassName = defaults.defaultRuntimeClassName;
        }

        public Builder setAllowedRuntimeClassNames(Input<List<String>> allowedRuntimeClassNames) {
            this.allowedRuntimeClassNames = Objects.requireNonNull(allowedRuntimeClassNames);
            return this;
        }

        public Builder setAllowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {
            this.allowedRuntimeClassNames = Input.of(Objects.requireNonNull(allowedRuntimeClassNames));
            return this;
        }

        public Builder setDefaultRuntimeClassName(@Nullable Input<String> defaultRuntimeClassName) {
            this.defaultRuntimeClassName = defaultRuntimeClassName;
            return this;
        }

        public Builder setDefaultRuntimeClassName(@Nullable String defaultRuntimeClassName) {
            this.defaultRuntimeClassName = Input.ofNullable(defaultRuntimeClassName);
            return this;
        }

        public RuntimeClassStrategyOptionsArgs build() {
            return new RuntimeClassStrategyOptionsArgs(allowedRuntimeClassNames, defaultRuntimeClassName);
        }
    }
}
