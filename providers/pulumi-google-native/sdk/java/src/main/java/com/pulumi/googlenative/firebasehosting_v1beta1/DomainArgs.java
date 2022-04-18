// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.firebasehosting_v1beta1.inputs.DomainRedirectArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * The domain name of the association.
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * If set, the domain should redirect with the provided parameters.
     * 
     */
    @Import(name="domainRedirect")
      private final @Nullable Output<DomainRedirectArgs> domainRedirect;

    public Output<DomainRedirectArgs> domainRedirect() {
        return this.domainRedirect == null ? Codegen.empty() : this.domainRedirect;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The site name of the association.
     * 
     */
    @Import(name="site", required=true)
      private final Output<String> site;

    public Output<String> site() {
        return this.site;
    }

    @Import(name="siteId", required=true)
      private final Output<String> siteId;

    public Output<String> siteId() {
        return this.siteId;
    }

    public DomainArgs(
        Output<String> domainName,
        @Nullable Output<DomainRedirectArgs> domainRedirect,
        @Nullable Output<String> project,
        Output<String> site,
        Output<String> siteId) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.domainRedirect = domainRedirect;
        this.project = project;
        this.site = Objects.requireNonNull(site, "expected parameter 'site' to be non-null");
        this.siteId = Objects.requireNonNull(siteId, "expected parameter 'siteId' to be non-null");
    }

    private DomainArgs() {
        this.domainName = Codegen.empty();
        this.domainRedirect = Codegen.empty();
        this.project = Codegen.empty();
        this.site = Codegen.empty();
        this.siteId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domainName;
        private @Nullable Output<DomainRedirectArgs> domainRedirect;
        private @Nullable Output<String> project;
        private Output<String> site;
        private Output<String> siteId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.domainRedirect = defaults.domainRedirect;
    	      this.project = defaults.project;
    	      this.site = defaults.site;
    	      this.siteId = defaults.siteId;
        }

        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }
        public Builder domainRedirect(@Nullable Output<DomainRedirectArgs> domainRedirect) {
            this.domainRedirect = domainRedirect;
            return this;
        }
        public Builder domainRedirect(@Nullable DomainRedirectArgs domainRedirect) {
            this.domainRedirect = Codegen.ofNullable(domainRedirect);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder site(Output<String> site) {
            this.site = Objects.requireNonNull(site);
            return this;
        }
        public Builder site(String site) {
            this.site = Output.of(Objects.requireNonNull(site));
            return this;
        }
        public Builder siteId(Output<String> siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }
        public Builder siteId(String siteId) {
            this.siteId = Output.of(Objects.requireNonNull(siteId));
            return this;
        }        public DomainArgs build() {
            return new DomainArgs(domainName, domainRedirect, project, site, siteId);
        }
    }
}
