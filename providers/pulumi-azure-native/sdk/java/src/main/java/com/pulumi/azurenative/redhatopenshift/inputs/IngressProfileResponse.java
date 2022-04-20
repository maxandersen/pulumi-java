// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.redhatopenshift.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IngressProfile represents an ingress profile.
 * 
 */
public final class IngressProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final IngressProfileResponse Empty = new IngressProfileResponse();

    /**
     * The IP of the ingress (immutable).
     * 
     */
    @Import(name="ip")
      private final @Nullable String ip;

    public Optional<String> ip() {
        return this.ip == null ? Optional.empty() : Optional.ofNullable(this.ip);
    }

    /**
     * The ingress profile name.  Must be &#34;default&#34; (immutable).
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Ingress visibility (immutable).
     * 
     */
    @Import(name="visibility")
      private final @Nullable String visibility;

    public Optional<String> visibility() {
        return this.visibility == null ? Optional.empty() : Optional.ofNullable(this.visibility);
    }

    public IngressProfileResponse(
        @Nullable String ip,
        @Nullable String name,
        @Nullable String visibility) {
        this.ip = ip;
        this.name = name;
        this.visibility = visibility;
    }

    private IngressProfileResponse() {
        this.ip = null;
        this.name = null;
        this.visibility = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ip;
        private @Nullable String name;
        private @Nullable String visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.name = defaults.name;
    	      this.visibility = defaults.visibility;
        }

        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder visibility(@Nullable String visibility) {
            this.visibility = visibility;
            return this;
        }        public IngressProfileResponse build() {
            return new IngressProfileResponse(ip, name, visibility);
        }
    }
}
