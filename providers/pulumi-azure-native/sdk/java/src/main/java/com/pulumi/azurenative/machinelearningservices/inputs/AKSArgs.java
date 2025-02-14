// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.AKSPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Machine Learning compute based on AKS.
 * 
 */
public final class AKSArgs extends com.pulumi.resources.ResourceArgs {

    public static final AKSArgs Empty = new AKSArgs();

    /**
     * Location for the underlying compute
     * 
     */
    @Import(name="computeLocation")
    private @Nullable Output<String> computeLocation;

    /**
     * @return Location for the underlying compute
     * 
     */
    public Optional<Output<String>> computeLocation() {
        return Optional.ofNullable(this.computeLocation);
    }

    /**
     * The type of compute
     * Expected value is &#39;AKS&#39;.
     * 
     */
    @Import(name="computeType", required=true)
    private Output<String> computeType;

    /**
     * @return The type of compute
     * Expected value is &#39;AKS&#39;.
     * 
     */
    public Output<String> computeType() {
        return this.computeType;
    }

    /**
     * The description of the Machine Learning compute.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Machine Learning compute.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * AKS properties
     * 
     */
    @Import(name="properties")
    private @Nullable Output<AKSPropertiesArgs> properties;

    /**
     * @return AKS properties
     * 
     */
    public Optional<Output<AKSPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * ARM resource id of the underlying compute
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return ARM resource id of the underlying compute
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    private AKSArgs() {}

    private AKSArgs(AKSArgs $) {
        this.computeLocation = $.computeLocation;
        this.computeType = $.computeType;
        this.description = $.description;
        this.properties = $.properties;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AKSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AKSArgs $;

        public Builder() {
            $ = new AKSArgs();
        }

        public Builder(AKSArgs defaults) {
            $ = new AKSArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeLocation Location for the underlying compute
         * 
         * @return builder
         * 
         */
        public Builder computeLocation(@Nullable Output<String> computeLocation) {
            $.computeLocation = computeLocation;
            return this;
        }

        /**
         * @param computeLocation Location for the underlying compute
         * 
         * @return builder
         * 
         */
        public Builder computeLocation(String computeLocation) {
            return computeLocation(Output.of(computeLocation));
        }

        /**
         * @param computeType The type of compute
         * Expected value is &#39;AKS&#39;.
         * 
         * @return builder
         * 
         */
        public Builder computeType(Output<String> computeType) {
            $.computeType = computeType;
            return this;
        }

        /**
         * @param computeType The type of compute
         * Expected value is &#39;AKS&#39;.
         * 
         * @return builder
         * 
         */
        public Builder computeType(String computeType) {
            return computeType(Output.of(computeType));
        }

        /**
         * @param description The description of the Machine Learning compute.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Machine Learning compute.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param properties AKS properties
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<AKSPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties AKS properties
         * 
         * @return builder
         * 
         */
        public Builder properties(AKSPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceId ARM resource id of the underlying compute
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId ARM resource id of the underlying compute
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public AKSArgs build() {
            $.computeType = Codegen.stringProp("computeType").output().arg($.computeType).require();
            return $;
        }
    }

}
