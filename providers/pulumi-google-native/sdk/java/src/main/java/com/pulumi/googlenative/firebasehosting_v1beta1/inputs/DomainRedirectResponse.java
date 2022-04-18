// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the behavior of a domain-level redirect. Domain redirects preserve the path of the redirect but replace the requested domain with the one specified in the redirect configuration.
 * 
 */
public final class DomainRedirectResponse extends com.pulumi.resources.InvokeArgs {

    public static final DomainRedirectResponse Empty = new DomainRedirectResponse();

    /**
     * The domain name to redirect to.
     * 
     */
    @Import(name="domainName", required=true)
      private final String domainName;

    public String domainName() {
        return this.domainName;
    }

    /**
     * The redirect status code.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public DomainRedirectResponse(
        String domainName,
        String type) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DomainRedirectResponse() {
        this.domainName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainRedirectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainRedirectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.type = defaults.type;
        }

        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DomainRedirectResponse build() {
            return new DomainRedirectResponse(domainName, type);
        }
    }
}
