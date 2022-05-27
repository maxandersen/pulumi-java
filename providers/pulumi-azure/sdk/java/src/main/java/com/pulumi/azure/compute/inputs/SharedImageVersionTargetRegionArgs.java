// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedImageVersionTargetRegionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SharedImageVersionTargetRegionArgs Empty = new SharedImageVersionTargetRegionArgs();

    /**
     * The Azure Region in which this Image Version should exist.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Azure Region in which this Image Version should exist.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The number of replicas of the Image Version to be created per region.
     * 
     */
    @Import(name="regionalReplicaCount", required=true)
    private Output<Integer> regionalReplicaCount;

    /**
     * @return The number of replicas of the Image Version to be created per region.
     * 
     */
    public Output<Integer> regionalReplicaCount() {
        return this.regionalReplicaCount;
    }

    /**
     * The storage account type for the image version. Possible values are `Standard_LRS` and `Standard_ZRS`. Defaults to `Standard_LRS`. You can store all of your image version replicas in Zone Redundant Storage by specifying `Standard_ZRS`.
     * 
     */
    @Import(name="storageAccountType")
    private @Nullable Output<String> storageAccountType;

    /**
     * @return The storage account type for the image version. Possible values are `Standard_LRS` and `Standard_ZRS`. Defaults to `Standard_LRS`. You can store all of your image version replicas in Zone Redundant Storage by specifying `Standard_ZRS`.
     * 
     */
    public Optional<Output<String>> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    private SharedImageVersionTargetRegionArgs() {}

    private SharedImageVersionTargetRegionArgs(SharedImageVersionTargetRegionArgs $) {
        this.name = $.name;
        this.regionalReplicaCount = $.regionalReplicaCount;
        this.storageAccountType = $.storageAccountType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedImageVersionTargetRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedImageVersionTargetRegionArgs $;

        public Builder() {
            $ = new SharedImageVersionTargetRegionArgs();
        }

        public Builder(SharedImageVersionTargetRegionArgs defaults) {
            $ = new SharedImageVersionTargetRegionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The Azure Region in which this Image Version should exist.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Azure Region in which this Image Version should exist.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param regionalReplicaCount The number of replicas of the Image Version to be created per region.
         * 
         * @return builder
         * 
         */
        public Builder regionalReplicaCount(Output<Integer> regionalReplicaCount) {
            $.regionalReplicaCount = regionalReplicaCount;
            return this;
        }

        /**
         * @param regionalReplicaCount The number of replicas of the Image Version to be created per region.
         * 
         * @return builder
         * 
         */
        public Builder regionalReplicaCount(Integer regionalReplicaCount) {
            return regionalReplicaCount(Output.of(regionalReplicaCount));
        }

        /**
         * @param storageAccountType The storage account type for the image version. Possible values are `Standard_LRS` and `Standard_ZRS`. Defaults to `Standard_LRS`. You can store all of your image version replicas in Zone Redundant Storage by specifying `Standard_ZRS`.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(@Nullable Output<String> storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        /**
         * @param storageAccountType The storage account type for the image version. Possible values are `Standard_LRS` and `Standard_ZRS`. Defaults to `Standard_LRS`. You can store all of your image version replicas in Zone Redundant Storage by specifying `Standard_ZRS`.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(String storageAccountType) {
            return storageAccountType(Output.of(storageAccountType));
        }

        public SharedImageVersionTargetRegionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.regionalReplicaCount = Objects.requireNonNull($.regionalReplicaCount, "expected parameter 'regionalReplicaCount' to be non-null");
            return $;
        }
    }

}
