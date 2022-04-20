// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryPermissionsPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryPermissionsPolicyArgs Empty = new RepositoryPermissionsPolicyArgs();

    /**
     * The name of the domain on which to set the resource policy.
     * 
     */
    @Import(name="domain", required=true)
      private final Output<String> domain;

    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The account number of the AWS account that owns the domain.
     * 
     */
    @Import(name="domainOwner")
      private final @Nullable Output<String> domainOwner;

    public Output<String> domainOwner() {
        return this.domainOwner == null ? Codegen.empty() : this.domainOwner;
    }

    /**
     * A JSON policy string to be set as the access control resource policy on the provided domain.
     * 
     */
    @Import(name="policyDocument", required=true)
      private final Output<String> policyDocument;

    public Output<String> policyDocument() {
        return this.policyDocument;
    }

    /**
     * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain&#39;s resource policy.
     * 
     */
    @Import(name="policyRevision")
      private final @Nullable Output<String> policyRevision;

    public Output<String> policyRevision() {
        return this.policyRevision == null ? Codegen.empty() : this.policyRevision;
    }

    /**
     * The name of the repository to set the resource policy on.
     * 
     */
    @Import(name="repository", required=true)
      private final Output<String> repository;

    public Output<String> repository() {
        return this.repository;
    }

    public RepositoryPermissionsPolicyArgs(
        Output<String> domain,
        @Nullable Output<String> domainOwner,
        Output<String> policyDocument,
        @Nullable Output<String> policyRevision,
        Output<String> repository) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.domainOwner = domainOwner;
        this.policyDocument = Objects.requireNonNull(policyDocument, "expected parameter 'policyDocument' to be non-null");
        this.policyRevision = policyRevision;
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
    }

    private RepositoryPermissionsPolicyArgs() {
        this.domain = Codegen.empty();
        this.domainOwner = Codegen.empty();
        this.policyDocument = Codegen.empty();
        this.policyRevision = Codegen.empty();
        this.repository = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryPermissionsPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domain;
        private @Nullable Output<String> domainOwner;
        private Output<String> policyDocument;
        private @Nullable Output<String> policyRevision;
        private Output<String> repository;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryPermissionsPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.domainOwner = defaults.domainOwner;
    	      this.policyDocument = defaults.policyDocument;
    	      this.policyRevision = defaults.policyRevision;
    	      this.repository = defaults.repository;
        }

        public Builder domain(Output<String> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Output.of(Objects.requireNonNull(domain));
            return this;
        }
        public Builder domainOwner(@Nullable Output<String> domainOwner) {
            this.domainOwner = domainOwner;
            return this;
        }
        public Builder domainOwner(@Nullable String domainOwner) {
            this.domainOwner = Codegen.ofNullable(domainOwner);
            return this;
        }
        public Builder policyDocument(Output<String> policyDocument) {
            this.policyDocument = Objects.requireNonNull(policyDocument);
            return this;
        }
        public Builder policyDocument(String policyDocument) {
            this.policyDocument = Output.of(Objects.requireNonNull(policyDocument));
            return this;
        }
        public Builder policyRevision(@Nullable Output<String> policyRevision) {
            this.policyRevision = policyRevision;
            return this;
        }
        public Builder policyRevision(@Nullable String policyRevision) {
            this.policyRevision = Codegen.ofNullable(policyRevision);
            return this;
        }
        public Builder repository(Output<String> repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public Builder repository(String repository) {
            this.repository = Output.of(Objects.requireNonNull(repository));
            return this;
        }        public RepositoryPermissionsPolicyArgs build() {
            return new RepositoryPermissionsPolicyArgs(domain, domainOwner, policyDocument, policyRevision, repository);
        }
    }
}
