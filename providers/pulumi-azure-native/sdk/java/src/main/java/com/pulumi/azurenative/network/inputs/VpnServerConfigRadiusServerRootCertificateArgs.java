// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Radius Server root certificate of VpnServerConfiguration.
 * 
 */
public final class VpnServerConfigRadiusServerRootCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnServerConfigRadiusServerRootCertificateArgs Empty = new VpnServerConfigRadiusServerRootCertificateArgs();

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
     * The certificate public data.
     * 
     */
    @Import(name="publicCertData")
    private @Nullable Output<String> publicCertData;

    /**
     * @return The certificate public data.
     * 
     */
    public Optional<Output<String>> publicCertData() {
        return Optional.ofNullable(this.publicCertData);
    }

    private VpnServerConfigRadiusServerRootCertificateArgs() {}

    private VpnServerConfigRadiusServerRootCertificateArgs(VpnServerConfigRadiusServerRootCertificateArgs $) {
        this.name = $.name;
        this.publicCertData = $.publicCertData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnServerConfigRadiusServerRootCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnServerConfigRadiusServerRootCertificateArgs $;

        public Builder() {
            $ = new VpnServerConfigRadiusServerRootCertificateArgs();
        }

        public Builder(VpnServerConfigRadiusServerRootCertificateArgs defaults) {
            $ = new VpnServerConfigRadiusServerRootCertificateArgs(Objects.requireNonNull(defaults));
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
         * @param publicCertData The certificate public data.
         * 
         * @return builder
         * 
         */
        public Builder publicCertData(@Nullable Output<String> publicCertData) {
            $.publicCertData = publicCertData;
            return this;
        }

        /**
         * @param publicCertData The certificate public data.
         * 
         * @return builder
         * 
         */
        public Builder publicCertData(String publicCertData) {
            return publicCertData(Output.of(publicCertData));
        }

        public VpnServerConfigRadiusServerRootCertificateArgs build() {
            return $;
        }
    }

}
