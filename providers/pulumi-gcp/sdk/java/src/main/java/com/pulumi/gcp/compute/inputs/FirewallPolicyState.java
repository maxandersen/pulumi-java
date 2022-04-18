// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyState Empty = new FirewallPolicyState();

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> creationTimestamp() {
        return this.creationTimestamp == null ? Codegen.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Fingerprint of the resource. This field is used internally during updates of this resource.
     * 
     */
    @Import(name="fingerprint")
      private final @Nullable Output<String> fingerprint;

    public Output<String> fingerprint() {
        return this.fingerprint == null ? Codegen.empty() : this.fingerprint;
    }

    /**
     * The unique identifier for the resource. This identifier is defined by the server.
     * 
     */
    @Import(name="firewallPolicyId")
      private final @Nullable Output<String> firewallPolicyId;

    public Output<String> firewallPolicyId() {
        return this.firewallPolicyId == null ? Codegen.empty() : this.firewallPolicyId;
    }

    /**
     * Name of the resource. It is a numeric ID allocated by GCP which uniquely identifies the Firewall Policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The parent of the firewall policy.
     * 
     */
    @Import(name="parent")
      private final @Nullable Output<String> parent;

    public Output<String> parent() {
        return this.parent == null ? Codegen.empty() : this.parent;
    }

    /**
     * Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
     * 
     */
    @Import(name="ruleTupleCount")
      private final @Nullable Output<Integer> ruleTupleCount;

    public Output<Integer> ruleTupleCount() {
        return this.ruleTupleCount == null ? Codegen.empty() : this.ruleTupleCount;
    }

    /**
     * Server-defined URL for the resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> selfLink() {
        return this.selfLink == null ? Codegen.empty() : this.selfLink;
    }

    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @Import(name="selfLinkWithId")
      private final @Nullable Output<String> selfLinkWithId;

    public Output<String> selfLinkWithId() {
        return this.selfLinkWithId == null ? Codegen.empty() : this.selfLinkWithId;
    }

    /**
     * User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="shortName")
      private final @Nullable Output<String> shortName;

    public Output<String> shortName() {
        return this.shortName == null ? Codegen.empty() : this.shortName;
    }

    public FirewallPolicyState(
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<String> description,
        @Nullable Output<String> fingerprint,
        @Nullable Output<String> firewallPolicyId,
        @Nullable Output<String> name,
        @Nullable Output<String> parent,
        @Nullable Output<Integer> ruleTupleCount,
        @Nullable Output<String> selfLink,
        @Nullable Output<String> selfLinkWithId,
        @Nullable Output<String> shortName) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.fingerprint = fingerprint;
        this.firewallPolicyId = firewallPolicyId;
        this.name = name;
        this.parent = parent;
        this.ruleTupleCount = ruleTupleCount;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.shortName = shortName;
    }

    private FirewallPolicyState() {
        this.creationTimestamp = Codegen.empty();
        this.description = Codegen.empty();
        this.fingerprint = Codegen.empty();
        this.firewallPolicyId = Codegen.empty();
        this.name = Codegen.empty();
        this.parent = Codegen.empty();
        this.ruleTupleCount = Codegen.empty();
        this.selfLink = Codegen.empty();
        this.selfLinkWithId = Codegen.empty();
        this.shortName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<String> description;
        private @Nullable Output<String> fingerprint;
        private @Nullable Output<String> firewallPolicyId;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parent;
        private @Nullable Output<Integer> ruleTupleCount;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<String> selfLinkWithId;
        private @Nullable Output<String> shortName;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.firewallPolicyId = defaults.firewallPolicyId;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.ruleTupleCount = defaults.ruleTupleCount;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.shortName = defaults.shortName;
        }

        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Codegen.ofNullable(creationTimestamp);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public Builder fingerprint(@Nullable String fingerprint) {
            this.fingerprint = Codegen.ofNullable(fingerprint);
            return this;
        }
        public Builder firewallPolicyId(@Nullable Output<String> firewallPolicyId) {
            this.firewallPolicyId = firewallPolicyId;
            return this;
        }
        public Builder firewallPolicyId(@Nullable String firewallPolicyId) {
            this.firewallPolicyId = Codegen.ofNullable(firewallPolicyId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder parent(@Nullable Output<String> parent) {
            this.parent = parent;
            return this;
        }
        public Builder parent(@Nullable String parent) {
            this.parent = Codegen.ofNullable(parent);
            return this;
        }
        public Builder ruleTupleCount(@Nullable Output<Integer> ruleTupleCount) {
            this.ruleTupleCount = ruleTupleCount;
            return this;
        }
        public Builder ruleTupleCount(@Nullable Integer ruleTupleCount) {
            this.ruleTupleCount = Codegen.ofNullable(ruleTupleCount);
            return this;
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Codegen.ofNullable(selfLink);
            return this;
        }
        public Builder selfLinkWithId(@Nullable Output<String> selfLinkWithId) {
            this.selfLinkWithId = selfLinkWithId;
            return this;
        }
        public Builder selfLinkWithId(@Nullable String selfLinkWithId) {
            this.selfLinkWithId = Codegen.ofNullable(selfLinkWithId);
            return this;
        }
        public Builder shortName(@Nullable Output<String> shortName) {
            this.shortName = shortName;
            return this;
        }
        public Builder shortName(@Nullable String shortName) {
            this.shortName = Codegen.ofNullable(shortName);
            return this;
        }        public FirewallPolicyState build() {
            return new FirewallPolicyState(creationTimestamp, description, fingerprint, firewallPolicyId, name, parent, ruleTupleCount, selfLink, selfLinkWithId, shortName);
        }
    }
}
