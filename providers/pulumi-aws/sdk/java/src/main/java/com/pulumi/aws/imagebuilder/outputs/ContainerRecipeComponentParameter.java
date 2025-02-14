// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContainerRecipeComponentParameter {
    /**
     * @return The name of the component parameter.
     * 
     */
    private final String name;
    /**
     * @return The value for the named component parameter.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ContainerRecipeComponentParameter(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return The name of the component parameter.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value for the named component parameter.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeComponentParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeComponentParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ContainerRecipeComponentParameter build() {
            return new ContainerRecipeComponentParameter(name, value);
        }
    }
}
