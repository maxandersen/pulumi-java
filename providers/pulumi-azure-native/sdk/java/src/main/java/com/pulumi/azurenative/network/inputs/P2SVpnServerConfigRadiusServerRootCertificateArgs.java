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
 * Radius Server root certificate of P2SVpnServerConfiguration.
 * 
 */
public final class P2SVpnServerConfigRadiusServerRootCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final P2SVpnServerConfigRadiusServerRootCertificateArgs Empty = new P2SVpnServerConfigRadiusServerRootCertificateArgs();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The certificate public data.
     * 
     */
    @Import(name="publicCertData", required=true)
    private Output<String> publicCertData;

    public Output<String> publicCertData() {
        return this.publicCertData;
    }

    private P2SVpnServerConfigRadiusServerRootCertificateArgs() {}

    private P2SVpnServerConfigRadiusServerRootCertificateArgs(P2SVpnServerConfigRadiusServerRootCertificateArgs $) {
        this.etag = $.etag;
        this.id = $.id;
        this.name = $.name;
        this.publicCertData = $.publicCertData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(P2SVpnServerConfigRadiusServerRootCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private P2SVpnServerConfigRadiusServerRootCertificateArgs $;

        public Builder() {
            $ = new P2SVpnServerConfigRadiusServerRootCertificateArgs();
        }

        public Builder(P2SVpnServerConfigRadiusServerRootCertificateArgs defaults) {
            $ = new P2SVpnServerConfigRadiusServerRootCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder publicCertData(Output<String> publicCertData) {
            $.publicCertData = publicCertData;
            return this;
        }

        public Builder publicCertData(String publicCertData) {
            return publicCertData(Output.of(publicCertData));
        }

        public P2SVpnServerConfigRadiusServerRootCertificateArgs build() {
            $.publicCertData = Objects.requireNonNull($.publicCertData, "expected parameter 'publicCertData' to be non-null");
            return $;
        }
    }

}
