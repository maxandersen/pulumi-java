// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3objectlambda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AccessPointTransformationConfiguration {
    private final List<String> actions;
    private final Object contentTransformation;

    @CustomType.Constructor
    private AccessPointTransformationConfiguration(
        @CustomType.Parameter("actions") List<String> actions,
        @CustomType.Parameter("contentTransformation") Object contentTransformation) {
        this.actions = actions;
        this.contentTransformation = contentTransformation;
    }

    public List<String> actions() {
        return this.actions;
    }
    public Object contentTransformation() {
        return this.contentTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointTransformationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> actions;
        private Object contentTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointTransformationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.contentTransformation = defaults.contentTransformation;
        }

        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        public Builder contentTransformation(Object contentTransformation) {
            this.contentTransformation = Objects.requireNonNull(contentTransformation);
            return this;
        }        public AccessPointTransformationConfiguration build() {
            return new AccessPointTransformationConfiguration(actions, contentTransformation);
        }
    }
}
