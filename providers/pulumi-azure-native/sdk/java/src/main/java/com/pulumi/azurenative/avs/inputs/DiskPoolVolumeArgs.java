// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An iSCSI volume from Microsoft.StoragePool provider
 * 
 */
public final class DiskPoolVolumeArgs extends ResourceArgs {

    public static final DiskPoolVolumeArgs Empty = new DiskPoolVolumeArgs();

    /**
     * iSCSI provider target IP address list
     * 
     */
    @Import(name="endpoints")
    private @Nullable Output<List<String>> endpoints;

    /**
     * @return iSCSI provider target IP address list
     * 
     */
    public Optional<Output<List<String>>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    /**
     * Name of the LUN to be used
     * 
     */
    @Import(name="lunName")
    private @Nullable Output<String> lunName;

    /**
     * @return Name of the LUN to be used
     * 
     */
    public Optional<Output<String>> lunName() {
        return Optional.ofNullable(this.lunName);
    }

    private DiskPoolVolumeArgs() {}

    private DiskPoolVolumeArgs(DiskPoolVolumeArgs $) {
        this.endpoints = $.endpoints;
        this.lunName = $.lunName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskPoolVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskPoolVolumeArgs $;

        public Builder() {
            $ = new DiskPoolVolumeArgs();
        }

        public Builder(DiskPoolVolumeArgs defaults) {
            $ = new DiskPoolVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoints iSCSI provider target IP address list
         * 
         * @return builder
         * 
         */
        public Builder endpoints(@Nullable Output<List<String>> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints iSCSI provider target IP address list
         * 
         * @return builder
         * 
         */
        public Builder endpoints(List<String> endpoints) {
            return endpoints(Output.of(endpoints));
        }

        /**
         * @param endpoints iSCSI provider target IP address list
         * 
         * @return builder
         * 
         */
        public Builder endpoints(String... endpoints) {
            return endpoints(List.of(endpoints));
        }

        /**
         * @param lunName Name of the LUN to be used
         * 
         * @return builder
         * 
         */
        public Builder lunName(@Nullable Output<String> lunName) {
            $.lunName = lunName;
            return this;
        }

        /**
         * @param lunName Name of the LUN to be used
         * 
         * @return builder
         * 
         */
        public Builder lunName(String lunName) {
            return lunName(Output.of(lunName));
        }

        public DiskPoolVolumeArgs build() {
            return $;
        }
    }

}
