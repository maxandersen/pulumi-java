// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Azure NetApp Files volume from Microsoft.NetApp provider
 * 
 */
public final class NetAppVolumeArgs extends ResourceArgs {

    public static final NetAppVolumeArgs Empty = new NetAppVolumeArgs();

    /**
     * File path through which the NFS volume is exposed by the provider
     * 
     */
    @Import(name="nfsFilePath")
    private @Nullable Output<String> nfsFilePath;

    /**
     * @return File path through which the NFS volume is exposed by the provider
     * 
     */
    public Optional<Output<String>> nfsFilePath() {
        return Optional.ofNullable(this.nfsFilePath);
    }

    /**
     * IP address of the NFS provider
     * 
     */
    @Import(name="nfsProviderIp")
    private @Nullable Output<String> nfsProviderIp;

    /**
     * @return IP address of the NFS provider
     * 
     */
    public Optional<Output<String>> nfsProviderIp() {
        return Optional.ofNullable(this.nfsProviderIp);
    }

    private NetAppVolumeArgs() {}

    private NetAppVolumeArgs(NetAppVolumeArgs $) {
        this.nfsFilePath = $.nfsFilePath;
        this.nfsProviderIp = $.nfsProviderIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetAppVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetAppVolumeArgs $;

        public Builder() {
            $ = new NetAppVolumeArgs();
        }

        public Builder(NetAppVolumeArgs defaults) {
            $ = new NetAppVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nfsFilePath File path through which the NFS volume is exposed by the provider
         * 
         * @return builder
         * 
         */
        public Builder nfsFilePath(@Nullable Output<String> nfsFilePath) {
            $.nfsFilePath = nfsFilePath;
            return this;
        }

        /**
         * @param nfsFilePath File path through which the NFS volume is exposed by the provider
         * 
         * @return builder
         * 
         */
        public Builder nfsFilePath(String nfsFilePath) {
            return nfsFilePath(Output.of(nfsFilePath));
        }

        /**
         * @param nfsProviderIp IP address of the NFS provider
         * 
         * @return builder
         * 
         */
        public Builder nfsProviderIp(@Nullable Output<String> nfsProviderIp) {
            $.nfsProviderIp = nfsProviderIp;
            return this;
        }

        /**
         * @param nfsProviderIp IP address of the NFS provider
         * 
         * @return builder
         * 
         */
        public Builder nfsProviderIp(String nfsProviderIp) {
            return nfsProviderIp(Output.of(nfsProviderIp));
        }

        public NetAppVolumeArgs build() {
            return $;
        }
    }

}
