// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExposureControlFeatureValueByFactoryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExposureControlFeatureValueByFactoryArgs Empty = new GetExposureControlFeatureValueByFactoryArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private String factoryName;

    /**
     * @return The factory name.
     * 
     */
    public String factoryName() {
        return this.factoryName;
    }

    /**
     * The feature name.
     * 
     */
    @Import(name="featureName")
    private @Nullable String featureName;

    /**
     * @return The feature name.
     * 
     */
    public Optional<String> featureName() {
        return Optional.ofNullable(this.featureName);
    }

    /**
     * The feature type.
     * 
     */
    @Import(name="featureType")
    private @Nullable String featureType;

    /**
     * @return The feature type.
     * 
     */
    public Optional<String> featureType() {
        return Optional.ofNullable(this.featureType);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetExposureControlFeatureValueByFactoryArgs() {}

    private GetExposureControlFeatureValueByFactoryArgs(GetExposureControlFeatureValueByFactoryArgs $) {
        this.factoryName = $.factoryName;
        this.featureName = $.featureName;
        this.featureType = $.featureType;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExposureControlFeatureValueByFactoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExposureControlFeatureValueByFactoryArgs $;

        public Builder() {
            $ = new GetExposureControlFeatureValueByFactoryArgs();
        }

        public Builder(GetExposureControlFeatureValueByFactoryArgs defaults) {
            $ = new GetExposureControlFeatureValueByFactoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(String factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        /**
         * @param featureName The feature name.
         * 
         * @return builder
         * 
         */
        public Builder featureName(@Nullable String featureName) {
            $.featureName = featureName;
            return this;
        }

        /**
         * @param featureType The feature type.
         * 
         * @return builder
         * 
         */
        public Builder featureType(@Nullable String featureType) {
            $.featureType = featureType;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetExposureControlFeatureValueByFactoryArgs build() {
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
