// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Profile for how to handle shutting down virtual machines.
 * 
 */
public final class AutoShutdownProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutoShutdownProfileResponse Empty = new AutoShutdownProfileResponse();

    /**
     * The amount of time a VM will stay running after a user disconnects if this behavior is enabled.
     * 
     */
    @Import(name="disconnectDelay")
      private final @Nullable String disconnectDelay;

    public Optional<String> disconnectDelay() {
        return this.disconnectDelay == null ? Optional.empty() : Optional.ofNullable(this.disconnectDelay);
    }

    /**
     * The amount of time a VM will idle before it is shutdown if this behavior is enabled.
     * 
     */
    @Import(name="idleDelay")
      private final @Nullable String idleDelay;

    public Optional<String> idleDelay() {
        return this.idleDelay == null ? Optional.empty() : Optional.ofNullable(this.idleDelay);
    }

    /**
     * The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled.
     * 
     */
    @Import(name="noConnectDelay")
      private final @Nullable String noConnectDelay;

    public Optional<String> noConnectDelay() {
        return this.noConnectDelay == null ? Optional.empty() : Optional.ofNullable(this.noConnectDelay);
    }

    /**
     * Whether shutdown on disconnect is enabled
     * 
     */
    @Import(name="shutdownOnDisconnect")
      private final @Nullable String shutdownOnDisconnect;

    public Optional<String> shutdownOnDisconnect() {
        return this.shutdownOnDisconnect == null ? Optional.empty() : Optional.ofNullable(this.shutdownOnDisconnect);
    }

    /**
     * Whether a VM will get shutdown when it has idled for a period of time.
     * 
     */
    @Import(name="shutdownOnIdle")
      private final @Nullable String shutdownOnIdle;

    public Optional<String> shutdownOnIdle() {
        return this.shutdownOnIdle == null ? Optional.empty() : Optional.ofNullable(this.shutdownOnIdle);
    }

    /**
     * Whether a VM will get shutdown when it hasn&#39;t been connected to after a period of time.
     * 
     */
    @Import(name="shutdownWhenNotConnected")
      private final @Nullable String shutdownWhenNotConnected;

    public Optional<String> shutdownWhenNotConnected() {
        return this.shutdownWhenNotConnected == null ? Optional.empty() : Optional.ofNullable(this.shutdownWhenNotConnected);
    }

    public AutoShutdownProfileResponse(
        @Nullable String disconnectDelay,
        @Nullable String idleDelay,
        @Nullable String noConnectDelay,
        @Nullable String shutdownOnDisconnect,
        @Nullable String shutdownOnIdle,
        @Nullable String shutdownWhenNotConnected) {
        this.disconnectDelay = disconnectDelay;
        this.idleDelay = idleDelay;
        this.noConnectDelay = noConnectDelay;
        this.shutdownOnDisconnect = Codegen.stringProp("shutdownOnDisconnect").arg(shutdownOnDisconnect).def("Disabled").getNullable();
        this.shutdownOnIdle = Codegen.stringProp("shutdownOnIdle").arg(shutdownOnIdle).def("None").getNullable();
        this.shutdownWhenNotConnected = Codegen.stringProp("shutdownWhenNotConnected").arg(shutdownWhenNotConnected).def("Disabled").getNullable();
    }

    private AutoShutdownProfileResponse() {
        this.disconnectDelay = null;
        this.idleDelay = null;
        this.noConnectDelay = null;
        this.shutdownOnDisconnect = null;
        this.shutdownOnIdle = null;
        this.shutdownWhenNotConnected = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoShutdownProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String disconnectDelay;
        private @Nullable String idleDelay;
        private @Nullable String noConnectDelay;
        private @Nullable String shutdownOnDisconnect;
        private @Nullable String shutdownOnIdle;
        private @Nullable String shutdownWhenNotConnected;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoShutdownProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disconnectDelay = defaults.disconnectDelay;
    	      this.idleDelay = defaults.idleDelay;
    	      this.noConnectDelay = defaults.noConnectDelay;
    	      this.shutdownOnDisconnect = defaults.shutdownOnDisconnect;
    	      this.shutdownOnIdle = defaults.shutdownOnIdle;
    	      this.shutdownWhenNotConnected = defaults.shutdownWhenNotConnected;
        }

        public Builder disconnectDelay(@Nullable String disconnectDelay) {
            this.disconnectDelay = disconnectDelay;
            return this;
        }
        public Builder idleDelay(@Nullable String idleDelay) {
            this.idleDelay = idleDelay;
            return this;
        }
        public Builder noConnectDelay(@Nullable String noConnectDelay) {
            this.noConnectDelay = noConnectDelay;
            return this;
        }
        public Builder shutdownOnDisconnect(@Nullable String shutdownOnDisconnect) {
            this.shutdownOnDisconnect = shutdownOnDisconnect;
            return this;
        }
        public Builder shutdownOnIdle(@Nullable String shutdownOnIdle) {
            this.shutdownOnIdle = shutdownOnIdle;
            return this;
        }
        public Builder shutdownWhenNotConnected(@Nullable String shutdownWhenNotConnected) {
            this.shutdownWhenNotConnected = shutdownWhenNotConnected;
            return this;
        }        public AutoShutdownProfileResponse build() {
            return new AutoShutdownProfileResponse(disconnectDelay, idleDelay, noConnectDelay, shutdownOnDisconnect, shutdownOnIdle, shutdownWhenNotConnected);
        }
    }
}
