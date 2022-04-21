// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.azurenative.labservices.enums.ConnectionType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connection profile for how users connect to lab virtual machines.
 * 
 */
public final class ConnectionProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionProfileArgs Empty = new ConnectionProfileArgs();

    /**
     * The enabled access level for Client Access over RDP.
     * 
     */
    @Import(name="clientRdpAccess")
    private @Nullable Output<ConnectionType> clientRdpAccess;

    public Optional<Output<ConnectionType>> clientRdpAccess() {
        return Optional.ofNullable(this.clientRdpAccess);
    }

    /**
     * The enabled access level for Client Access over SSH.
     * 
     */
    @Import(name="clientSshAccess")
    private @Nullable Output<ConnectionType> clientSshAccess;

    public Optional<Output<ConnectionType>> clientSshAccess() {
        return Optional.ofNullable(this.clientSshAccess);
    }

    /**
     * The enabled access level for Web Access over RDP.
     * 
     */
    @Import(name="webRdpAccess")
    private @Nullable Output<ConnectionType> webRdpAccess;

    public Optional<Output<ConnectionType>> webRdpAccess() {
        return Optional.ofNullable(this.webRdpAccess);
    }

    /**
     * The enabled access level for Web Access over SSH.
     * 
     */
    @Import(name="webSshAccess")
    private @Nullable Output<ConnectionType> webSshAccess;

    public Optional<Output<ConnectionType>> webSshAccess() {
        return Optional.ofNullable(this.webSshAccess);
    }

    private ConnectionProfileArgs() {}

    private ConnectionProfileArgs(ConnectionProfileArgs $) {
        this.clientRdpAccess = $.clientRdpAccess;
        this.clientSshAccess = $.clientSshAccess;
        this.webRdpAccess = $.webRdpAccess;
        this.webSshAccess = $.webSshAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionProfileArgs $;

        public Builder() {
            $ = new ConnectionProfileArgs();
        }

        public Builder(ConnectionProfileArgs defaults) {
            $ = new ConnectionProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientRdpAccess(@Nullable Output<ConnectionType> clientRdpAccess) {
            $.clientRdpAccess = clientRdpAccess;
            return this;
        }

        public Builder clientRdpAccess(ConnectionType clientRdpAccess) {
            return clientRdpAccess(Output.of(clientRdpAccess));
        }

        public Builder clientSshAccess(@Nullable Output<ConnectionType> clientSshAccess) {
            $.clientSshAccess = clientSshAccess;
            return this;
        }

        public Builder clientSshAccess(ConnectionType clientSshAccess) {
            return clientSshAccess(Output.of(clientSshAccess));
        }

        public Builder webRdpAccess(@Nullable Output<ConnectionType> webRdpAccess) {
            $.webRdpAccess = webRdpAccess;
            return this;
        }

        public Builder webRdpAccess(ConnectionType webRdpAccess) {
            return webRdpAccess(Output.of(webRdpAccess));
        }

        public Builder webSshAccess(@Nullable Output<ConnectionType> webSshAccess) {
            $.webSshAccess = webSshAccess;
            return this;
        }

        public Builder webSshAccess(ConnectionType webSshAccess) {
            return webSshAccess(Output.of(webSshAccess));
        }

        public ConnectionProfileArgs build() {
            $.clientRdpAccess = Codegen.objectProp("clientRdpAccess", ConnectionType.class).output().arg($.clientRdpAccess).def(ConnectionType.None).getNullable();
            $.clientSshAccess = Codegen.objectProp("clientSshAccess", ConnectionType.class).output().arg($.clientSshAccess).def(ConnectionType.None).getNullable();
            $.webRdpAccess = Codegen.objectProp("webRdpAccess", ConnectionType.class).output().arg($.webRdpAccess).def(ConnectionType.None).getNullable();
            $.webSshAccess = Codegen.objectProp("webSshAccess", ConnectionType.class).output().arg($.webSshAccess).def(ConnectionType.None).getNullable();
            return $;
        }
    }

}
