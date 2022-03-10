// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ForwardingRuleInfoResponse {
    /**
     * Name of a Compute Engine forwarding rule.
     * 
     */
    private final String displayName;
    /**
     * Port range defined in the forwarding rule that matches the test.
     * 
     */
    private final String matchedPortRange;
    /**
     * Protocol defined in the forwarding rule that matches the test.
     * 
     */
    private final String matchedProtocol;
    /**
     * Network URI. Only valid for Internal Load Balancer.
     * 
     */
    private final String networkUri;
    /**
     * Target type of the forwarding rule.
     * 
     */
    private final String target;
    /**
     * URI of a Compute Engine forwarding rule.
     * 
     */
    private final String uri;
    /**
     * VIP of the forwarding rule.
     * 
     */
    private final String vip;

    @OutputCustomType.Constructor
    private ForwardingRuleInfoResponse(
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("matchedPortRange") String matchedPortRange,
        @OutputCustomType.Parameter("matchedProtocol") String matchedProtocol,
        @OutputCustomType.Parameter("networkUri") String networkUri,
        @OutputCustomType.Parameter("target") String target,
        @OutputCustomType.Parameter("uri") String uri,
        @OutputCustomType.Parameter("vip") String vip) {
        this.displayName = displayName;
        this.matchedPortRange = matchedPortRange;
        this.matchedProtocol = matchedProtocol;
        this.networkUri = networkUri;
        this.target = target;
        this.uri = uri;
        this.vip = vip;
    }

    /**
     * Name of a Compute Engine forwarding rule.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Port range defined in the forwarding rule that matches the test.
     * 
    */
    public String getMatchedPortRange() {
        return this.matchedPortRange;
    }
    /**
     * Protocol defined in the forwarding rule that matches the test.
     * 
    */
    public String getMatchedProtocol() {
        return this.matchedProtocol;
    }
    /**
     * Network URI. Only valid for Internal Load Balancer.
     * 
    */
    public String getNetworkUri() {
        return this.networkUri;
    }
    /**
     * Target type of the forwarding rule.
     * 
    */
    public String getTarget() {
        return this.target;
    }
    /**
     * URI of a Compute Engine forwarding rule.
     * 
    */
    public String getUri() {
        return this.uri;
    }
    /**
     * VIP of the forwarding rule.
     * 
    */
    public String getVip() {
        return this.vip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardingRuleInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String matchedPortRange;
        private String matchedProtocol;
        private String networkUri;
        private String target;
        private String uri;
        private String vip;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardingRuleInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.matchedPortRange = defaults.matchedPortRange;
    	      this.matchedProtocol = defaults.matchedProtocol;
    	      this.networkUri = defaults.networkUri;
    	      this.target = defaults.target;
    	      this.uri = defaults.uri;
    	      this.vip = defaults.vip;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setMatchedPortRange(String matchedPortRange) {
            this.matchedPortRange = Objects.requireNonNull(matchedPortRange);
            return this;
        }

        public Builder setMatchedProtocol(String matchedProtocol) {
            this.matchedProtocol = Objects.requireNonNull(matchedProtocol);
            return this;
        }

        public Builder setNetworkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setVip(String vip) {
            this.vip = Objects.requireNonNull(vip);
            return this;
        }
        public ForwardingRuleInfoResponse build() {
            return new ForwardingRuleInfoResponse(displayName, matchedPortRange, matchedProtocol, networkUri, target, uri, vip);
        }
    }
}
