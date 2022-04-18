// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class InstanceInfoResponse {
    /**
     * Name of a Compute Engine instance.
     * 
     */
    private final String displayName;
    /**
     * External IP address of the network interface.
     * 
     */
    private final String externalIp;
    /**
     * Name of the network interface of a Compute Engine instance.
     * 
     */
    private final String interface_;
    /**
     * Internal IP address of the network interface.
     * 
     */
    private final String internalIp;
    /**
     * Network tags configured on the instance.
     * 
     */
    private final List<String> networkTags;
    /**
     * URI of a Compute Engine network.
     * 
     */
    private final String networkUri;
    /**
     * Service account authorized for the instance.
     * 
     */
    private final String serviceAccount;
    /**
     * URI of a Compute Engine instance.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private InstanceInfoResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("externalIp") String externalIp,
        @CustomType.Parameter("interface") String interface_,
        @CustomType.Parameter("internalIp") String internalIp,
        @CustomType.Parameter("networkTags") List<String> networkTags,
        @CustomType.Parameter("networkUri") String networkUri,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("uri") String uri) {
        this.displayName = displayName;
        this.externalIp = externalIp;
        this.interface_ = interface_;
        this.internalIp = internalIp;
        this.networkTags = networkTags;
        this.networkUri = networkUri;
        this.serviceAccount = serviceAccount;
        this.uri = uri;
    }

    /**
     * Name of a Compute Engine instance.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * External IP address of the network interface.
     * 
    */
    public String externalIp() {
        return this.externalIp;
    }
    /**
     * Name of the network interface of a Compute Engine instance.
     * 
    */
    public String interface_() {
        return this.interface_;
    }
    /**
     * Internal IP address of the network interface.
     * 
    */
    public String internalIp() {
        return this.internalIp;
    }
    /**
     * Network tags configured on the instance.
     * 
    */
    public List<String> networkTags() {
        return this.networkTags;
    }
    /**
     * URI of a Compute Engine network.
     * 
    */
    public String networkUri() {
        return this.networkUri;
    }
    /**
     * Service account authorized for the instance.
     * 
    */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * URI of a Compute Engine instance.
     * 
    */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String externalIp;
        private String interface_;
        private String internalIp;
        private List<String> networkTags;
        private String networkUri;
        private String serviceAccount;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.externalIp = defaults.externalIp;
    	      this.interface_ = defaults.interface_;
    	      this.internalIp = defaults.internalIp;
    	      this.networkTags = defaults.networkTags;
    	      this.networkUri = defaults.networkUri;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.uri = defaults.uri;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder externalIp(String externalIp) {
            this.externalIp = Objects.requireNonNull(externalIp);
            return this;
        }
        public Builder interface_(String interface_) {
            this.interface_ = Objects.requireNonNull(interface_);
            return this;
        }
        public Builder internalIp(String internalIp) {
            this.internalIp = Objects.requireNonNull(internalIp);
            return this;
        }
        public Builder networkTags(List<String> networkTags) {
            this.networkTags = Objects.requireNonNull(networkTags);
            return this;
        }
        public Builder networkTags(String... networkTags) {
            return networkTags(List.of(networkTags));
        }
        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public InstanceInfoResponse build() {
            return new InstanceInfoResponse(displayName, externalIp, interface_, internalIp, networkTags, networkUri, serviceAccount, uri);
        }
    }
}
