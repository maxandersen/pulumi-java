// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the Radius client root certificate of VpnServerConfiguration.
 * 
 */
public final class VpnServerConfigRadiusClientRootCertificateArgs extends ResourceArgs {

    public static final VpnServerConfigRadiusClientRootCertificateArgs Empty = new VpnServerConfigRadiusClientRootCertificateArgs();

    /**
     * The certificate name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The certificate name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Radius client root certificate thumbprint.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable Output<String> thumbprint;

    /**
     * @return The Radius client root certificate thumbprint.
     * 
     */
    public Optional<Output<String>> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    private VpnServerConfigRadiusClientRootCertificateArgs() {}

    private VpnServerConfigRadiusClientRootCertificateArgs(VpnServerConfigRadiusClientRootCertificateArgs $) {
        this.name = $.name;
        this.thumbprint = $.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnServerConfigRadiusClientRootCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnServerConfigRadiusClientRootCertificateArgs $;

        public Builder() {
            $ = new VpnServerConfigRadiusClientRootCertificateArgs();
        }

        public Builder(VpnServerConfigRadiusClientRootCertificateArgs defaults) {
            $ = new VpnServerConfigRadiusClientRootCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The certificate name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The certificate name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param thumbprint The Radius client root certificate thumbprint.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The Radius client root certificate thumbprint.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        public VpnServerConfigRadiusClientRootCertificateArgs build() {
            return $;
        }
    }

}
