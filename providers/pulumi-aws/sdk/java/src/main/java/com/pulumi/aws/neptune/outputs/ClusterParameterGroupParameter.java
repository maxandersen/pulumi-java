// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.neptune.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterParameterGroupParameter {
    /**
     * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
     * 
     */
    private final @Nullable String applyMethod;
    /**
     * The name of the neptune parameter.
     * 
     */
    private final String name;
    /**
     * The value of the neptune parameter.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ClusterParameterGroupParameter(
        @CustomType.Parameter("applyMethod") @Nullable String applyMethod,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.applyMethod = applyMethod;
        this.name = name;
        this.value = value;
    }

    /**
     * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
     * 
    */
    public Optional<String> applyMethod() {
        return Optional.ofNullable(this.applyMethod);
    }
    /**
     * The name of the neptune parameter.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The value of the neptune parameter.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterParameterGroupParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applyMethod;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterParameterGroupParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyMethod = defaults.applyMethod;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder applyMethod(@Nullable String applyMethod) {
            this.applyMethod = applyMethod;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ClusterParameterGroupParameter build() {
            return new ClusterParameterGroupParameter(applyMethod, name, value);
        }
    }
}
