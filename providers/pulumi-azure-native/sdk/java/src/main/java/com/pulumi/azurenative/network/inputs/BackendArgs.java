// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.BackendEnabledState;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Backend address of a frontDoor load balancer.
 * 
 */
public final class BackendArgs extends ResourceArgs {

    public static final BackendArgs Empty = new BackendArgs();

    /**
     * Location of the backend (IP address or FQDN)
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return Location of the backend (IP address or FQDN)
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The value to use as the host header sent to the backend. If blank or unspecified, this defaults to the incoming host.
     * 
     */
    @Import(name="backendHostHeader")
    private @Nullable Output<String> backendHostHeader;

    /**
     * @return The value to use as the host header sent to the backend. If blank or unspecified, this defaults to the incoming host.
     * 
     */
    public Optional<Output<String>> backendHostHeader() {
        return Optional.ofNullable(this.backendHostHeader);
    }

    /**
     * Whether to enable use of this backend. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @Import(name="enabledState")
    private @Nullable Output<Either<String,BackendEnabledState>> enabledState;

    /**
     * @return Whether to enable use of this backend. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    public Optional<Output<Either<String,BackendEnabledState>>> enabledState() {
        return Optional.ofNullable(this.enabledState);
    }

    /**
     * The HTTP TCP port number. Must be between 1 and 65535.
     * 
     */
    @Import(name="httpPort")
    private @Nullable Output<Integer> httpPort;

    /**
     * @return The HTTP TCP port number. Must be between 1 and 65535.
     * 
     */
    public Optional<Output<Integer>> httpPort() {
        return Optional.ofNullable(this.httpPort);
    }

    /**
     * The HTTPS TCP port number. Must be between 1 and 65535.
     * 
     */
    @Import(name="httpsPort")
    private @Nullable Output<Integer> httpsPort;

    /**
     * @return The HTTPS TCP port number. Must be between 1 and 65535.
     * 
     */
    public Optional<Output<Integer>> httpsPort() {
        return Optional.ofNullable(this.httpsPort);
    }

    /**
     * Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The Alias of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
     * 
     */
    @Import(name="privateLinkAlias")
    private @Nullable Output<String> privateLinkAlias;

    /**
     * @return The Alias of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
     * 
     */
    public Optional<Output<String>> privateLinkAlias() {
        return Optional.ofNullable(this.privateLinkAlias);
    }

    /**
     * A custom message to be included in the approval request to connect to the Private Link
     * 
     */
    @Import(name="privateLinkApprovalMessage")
    private @Nullable Output<String> privateLinkApprovalMessage;

    /**
     * @return A custom message to be included in the approval request to connect to the Private Link
     * 
     */
    public Optional<Output<String>> privateLinkApprovalMessage() {
        return Optional.ofNullable(this.privateLinkApprovalMessage);
    }

    /**
     * The location of the Private Link resource. Required only if &#39;privateLinkResourceId&#39; is populated
     * 
     */
    @Import(name="privateLinkLocation")
    private @Nullable Output<String> privateLinkLocation;

    /**
     * @return The location of the Private Link resource. Required only if &#39;privateLinkResourceId&#39; is populated
     * 
     */
    public Optional<Output<String>> privateLinkLocation() {
        return Optional.ofNullable(this.privateLinkLocation);
    }

    /**
     * The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
     * 
     */
    @Import(name="privateLinkResourceId")
    private @Nullable Output<String> privateLinkResourceId;

    /**
     * @return The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
     * 
     */
    public Optional<Output<String>> privateLinkResourceId() {
        return Optional.ofNullable(this.privateLinkResourceId);
    }

    /**
     * Weight of this endpoint for load balancing purposes.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return Weight of this endpoint for load balancing purposes.
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private BackendArgs() {}

    private BackendArgs(BackendArgs $) {
        this.address = $.address;
        this.backendHostHeader = $.backendHostHeader;
        this.enabledState = $.enabledState;
        this.httpPort = $.httpPort;
        this.httpsPort = $.httpsPort;
        this.priority = $.priority;
        this.privateLinkAlias = $.privateLinkAlias;
        this.privateLinkApprovalMessage = $.privateLinkApprovalMessage;
        this.privateLinkLocation = $.privateLinkLocation;
        this.privateLinkResourceId = $.privateLinkResourceId;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendArgs $;

        public Builder() {
            $ = new BackendArgs();
        }

        public Builder(BackendArgs defaults) {
            $ = new BackendArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address Location of the backend (IP address or FQDN)
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address Location of the backend (IP address or FQDN)
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param backendHostHeader The value to use as the host header sent to the backend. If blank or unspecified, this defaults to the incoming host.
         * 
         * @return builder
         * 
         */
        public Builder backendHostHeader(@Nullable Output<String> backendHostHeader) {
            $.backendHostHeader = backendHostHeader;
            return this;
        }

        /**
         * @param backendHostHeader The value to use as the host header sent to the backend. If blank or unspecified, this defaults to the incoming host.
         * 
         * @return builder
         * 
         */
        public Builder backendHostHeader(String backendHostHeader) {
            return backendHostHeader(Output.of(backendHostHeader));
        }

        /**
         * @param enabledState Whether to enable use of this backend. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder enabledState(@Nullable Output<Either<String,BackendEnabledState>> enabledState) {
            $.enabledState = enabledState;
            return this;
        }

        /**
         * @param enabledState Whether to enable use of this backend. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder enabledState(Either<String,BackendEnabledState> enabledState) {
            return enabledState(Output.of(enabledState));
        }

        /**
         * @param enabledState Whether to enable use of this backend. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder enabledState(String enabledState) {
            return enabledState(Either.ofLeft(enabledState));
        }

        /**
         * @param enabledState Whether to enable use of this backend. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder enabledState(BackendEnabledState enabledState) {
            return enabledState(Either.ofRight(enabledState));
        }

        /**
         * @param httpPort The HTTP TCP port number. Must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder httpPort(@Nullable Output<Integer> httpPort) {
            $.httpPort = httpPort;
            return this;
        }

        /**
         * @param httpPort The HTTP TCP port number. Must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder httpPort(Integer httpPort) {
            return httpPort(Output.of(httpPort));
        }

        /**
         * @param httpsPort The HTTPS TCP port number. Must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder httpsPort(@Nullable Output<Integer> httpsPort) {
            $.httpsPort = httpsPort;
            return this;
        }

        /**
         * @param httpsPort The HTTPS TCP port number. Must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder httpsPort(Integer httpsPort) {
            return httpsPort(Output.of(httpsPort));
        }

        /**
         * @param priority Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param privateLinkAlias The Alias of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
         * 
         * @return builder
         * 
         */
        public Builder privateLinkAlias(@Nullable Output<String> privateLinkAlias) {
            $.privateLinkAlias = privateLinkAlias;
            return this;
        }

        /**
         * @param privateLinkAlias The Alias of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
         * 
         * @return builder
         * 
         */
        public Builder privateLinkAlias(String privateLinkAlias) {
            return privateLinkAlias(Output.of(privateLinkAlias));
        }

        /**
         * @param privateLinkApprovalMessage A custom message to be included in the approval request to connect to the Private Link
         * 
         * @return builder
         * 
         */
        public Builder privateLinkApprovalMessage(@Nullable Output<String> privateLinkApprovalMessage) {
            $.privateLinkApprovalMessage = privateLinkApprovalMessage;
            return this;
        }

        /**
         * @param privateLinkApprovalMessage A custom message to be included in the approval request to connect to the Private Link
         * 
         * @return builder
         * 
         */
        public Builder privateLinkApprovalMessage(String privateLinkApprovalMessage) {
            return privateLinkApprovalMessage(Output.of(privateLinkApprovalMessage));
        }

        /**
         * @param privateLinkLocation The location of the Private Link resource. Required only if &#39;privateLinkResourceId&#39; is populated
         * 
         * @return builder
         * 
         */
        public Builder privateLinkLocation(@Nullable Output<String> privateLinkLocation) {
            $.privateLinkLocation = privateLinkLocation;
            return this;
        }

        /**
         * @param privateLinkLocation The location of the Private Link resource. Required only if &#39;privateLinkResourceId&#39; is populated
         * 
         * @return builder
         * 
         */
        public Builder privateLinkLocation(String privateLinkLocation) {
            return privateLinkLocation(Output.of(privateLinkLocation));
        }

        /**
         * @param privateLinkResourceId The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceId(@Nullable Output<String> privateLinkResourceId) {
            $.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        /**
         * @param privateLinkResourceId The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceId(String privateLinkResourceId) {
            return privateLinkResourceId(Output.of(privateLinkResourceId));
        }

        /**
         * @param weight Weight of this endpoint for load balancing purposes.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Weight of this endpoint for load balancing purposes.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public BackendArgs build() {
            return $;
        }
    }

}
