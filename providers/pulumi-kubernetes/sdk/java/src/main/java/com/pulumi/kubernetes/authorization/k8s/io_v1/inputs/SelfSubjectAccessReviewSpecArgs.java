// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.authorization.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.authorization.k8s.io_v1.inputs.NonResourceAttributesArgs;
import com.pulumi.kubernetes.authorization.k8s.io_v1.inputs.ResourceAttributesArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 * 
 */
public final class SelfSubjectAccessReviewSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final SelfSubjectAccessReviewSpecArgs Empty = new SelfSubjectAccessReviewSpecArgs();

    /**
     * NonResourceAttributes describes information for a non-resource access request
     * 
     */
    @Import(name="nonResourceAttributes")
    private @Nullable Output<NonResourceAttributesArgs> nonResourceAttributes;

    public Optional<Output<NonResourceAttributesArgs>> nonResourceAttributes() {
        return Optional.ofNullable(this.nonResourceAttributes);
    }

    /**
     * ResourceAuthorizationAttributes describes information for a resource access request
     * 
     */
    @Import(name="resourceAttributes")
    private @Nullable Output<ResourceAttributesArgs> resourceAttributes;

    public Optional<Output<ResourceAttributesArgs>> resourceAttributes() {
        return Optional.ofNullable(this.resourceAttributes);
    }

    private SelfSubjectAccessReviewSpecArgs() {}

    private SelfSubjectAccessReviewSpecArgs(SelfSubjectAccessReviewSpecArgs $) {
        this.nonResourceAttributes = $.nonResourceAttributes;
        this.resourceAttributes = $.resourceAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SelfSubjectAccessReviewSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SelfSubjectAccessReviewSpecArgs $;

        public Builder() {
            $ = new SelfSubjectAccessReviewSpecArgs();
        }

        public Builder(SelfSubjectAccessReviewSpecArgs defaults) {
            $ = new SelfSubjectAccessReviewSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder nonResourceAttributes(@Nullable Output<NonResourceAttributesArgs> nonResourceAttributes) {
            $.nonResourceAttributes = nonResourceAttributes;
            return this;
        }

        public Builder nonResourceAttributes(NonResourceAttributesArgs nonResourceAttributes) {
            return nonResourceAttributes(Output.of(nonResourceAttributes));
        }

        public Builder resourceAttributes(@Nullable Output<ResourceAttributesArgs> resourceAttributes) {
            $.resourceAttributes = resourceAttributes;
            return this;
        }

        public Builder resourceAttributes(ResourceAttributesArgs resourceAttributes) {
            return resourceAttributes(Output.of(resourceAttributes));
        }

        public SelfSubjectAccessReviewSpecArgs build() {
            return $;
        }
    }

}
