// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * For display only. Metadata associated with a Compute Engine instance.
 * 
 */
public final class InstanceInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstanceInfoResponse Empty = new InstanceInfoResponse();

    /**
     * Name of a Compute Engine instance.
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * External IP address of the network interface.
     * 
     */
    @Import(name="externalIp", required=true)
    private String externalIp;

    public String externalIp() {
        return this.externalIp;
    }

    /**
     * Name of the network interface of a Compute Engine instance.
     * 
     */
    @Import(name="interface", required=true)
    private String interface_;

    public String interface_() {
        return this.interface_;
    }

    /**
     * Internal IP address of the network interface.
     * 
     */
    @Import(name="internalIp", required=true)
    private String internalIp;

    public String internalIp() {
        return this.internalIp;
    }

    /**
     * Network tags configured on the instance.
     * 
     */
    @Import(name="networkTags", required=true)
    private List<String> networkTags;

    public List<String> networkTags() {
        return this.networkTags;
    }

    /**
     * URI of a Compute Engine network.
     * 
     */
    @Import(name="networkUri", required=true)
    private String networkUri;

    public String networkUri() {
        return this.networkUri;
    }

    /**
     * Service account authorized for the instance.
     * 
     */
    @Import(name="serviceAccount", required=true)
    private String serviceAccount;

    public String serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * URI of a Compute Engine instance.
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    public String uri() {
        return this.uri;
    }

    private InstanceInfoResponse() {}

    private InstanceInfoResponse(InstanceInfoResponse $) {
        this.displayName = $.displayName;
        this.externalIp = $.externalIp;
        this.interface_ = $.interface_;
        this.internalIp = $.internalIp;
        this.networkTags = $.networkTags;
        this.networkUri = $.networkUri;
        this.serviceAccount = $.serviceAccount;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceInfoResponse $;

        public Builder() {
            $ = new InstanceInfoResponse();
        }

        public Builder(InstanceInfoResponse defaults) {
            $ = new InstanceInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder externalIp(String externalIp) {
            $.externalIp = externalIp;
            return this;
        }

        public Builder interface_(String interface_) {
            $.interface_ = interface_;
            return this;
        }

        public Builder internalIp(String internalIp) {
            $.internalIp = internalIp;
            return this;
        }

        public Builder networkTags(List<String> networkTags) {
            $.networkTags = networkTags;
            return this;
        }

        public Builder networkTags(String... networkTags) {
            return networkTags(List.of(networkTags));
        }

        public Builder networkUri(String networkUri) {
            $.networkUri = networkUri;
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        public InstanceInfoResponse build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.externalIp = Objects.requireNonNull($.externalIp, "expected parameter 'externalIp' to be non-null");
            $.interface_ = Objects.requireNonNull($.interface_, "expected parameter 'interface' to be non-null");
            $.internalIp = Objects.requireNonNull($.internalIp, "expected parameter 'internalIp' to be non-null");
            $.networkTags = Objects.requireNonNull($.networkTags, "expected parameter 'networkTags' to be non-null");
            $.networkUri = Objects.requireNonNull($.networkUri, "expected parameter 'networkUri' to be non-null");
            $.serviceAccount = Objects.requireNonNull($.serviceAccount, "expected parameter 'serviceAccount' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
