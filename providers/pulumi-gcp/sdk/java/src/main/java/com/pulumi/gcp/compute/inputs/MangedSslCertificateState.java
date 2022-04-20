// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.compute.inputs.MangedSslCertificateManagedGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MangedSslCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final MangedSslCertificateState Empty = new MangedSslCertificateState();

    /**
     * The unique identifier for the resource.
     * 
     */
    @Import(name="certificateId")
      private final @Nullable Output<Integer> certificateId;

    public Output<Integer> certificateId() {
        return this.certificateId == null ? Codegen.empty() : this.certificateId;
    }

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
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Expire time of the certificate.
     * 
     */
    @Import(name="expireTime")
      private final @Nullable Output<String> expireTime;

    public Output<String> expireTime() {
        return this.expireTime == null ? Codegen.empty() : this.expireTime;
    }

    /**
     * Properties relevant to a managed certificate. These will be used if the certificate is managed (as indicated by a value
     * of &#39;MANAGED&#39; in &#39;type&#39;).
     * 
     */
    @Import(name="managed")
      private final @Nullable Output<MangedSslCertificateManagedGetArgs> managed;

    public Output<MangedSslCertificateManagedGetArgs> managed() {
        return this.managed == null ? Codegen.empty() : this.managed;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
     * &#39;[a-z]([-a-z0-9]*[a-z0-9])?&#39; which means the first character must be a lowercase letter, and all following characters
     * must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. These are in the same
     * namespace as the managed SSL certificates.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> selfLink() {
        return this.selfLink == null ? Codegen.empty() : this.selfLink;
    }

    /**
     * Domains associated with the certificate via Subject Alternative Name.
     * 
     */
    @Import(name="subjectAlternativeNames")
      private final @Nullable Output<List<String>> subjectAlternativeNames;

    public Output<List<String>> subjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? Codegen.empty() : this.subjectAlternativeNames;
    }

    /**
     * Enum field whose value is always &#39;MANAGED&#39; - used to signal to the API which type this is. Default value: &#34;MANAGED&#34;
     * Possible values: [&#34;MANAGED&#34;]
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public MangedSslCertificateState(
        @Nullable Output<Integer> certificateId,
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<String> description,
        @Nullable Output<String> expireTime,
        @Nullable Output<MangedSslCertificateManagedGetArgs> managed,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> selfLink,
        @Nullable Output<List<String>> subjectAlternativeNames,
        @Nullable Output<String> type) {
        this.certificateId = certificateId;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.expireTime = expireTime;
        this.managed = managed;
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.type = type;
    }

    private MangedSslCertificateState() {
        this.certificateId = Codegen.empty();
        this.creationTimestamp = Codegen.empty();
        this.description = Codegen.empty();
        this.expireTime = Codegen.empty();
        this.managed = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.selfLink = Codegen.empty();
        this.subjectAlternativeNames = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MangedSslCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> certificateId;
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<String> description;
        private @Nullable Output<String> expireTime;
        private @Nullable Output<MangedSslCertificateManagedGetArgs> managed;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<List<String>> subjectAlternativeNames;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MangedSslCertificateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.expireTime = defaults.expireTime;
    	      this.managed = defaults.managed;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.type = defaults.type;
        }

        public Builder certificateId(@Nullable Output<Integer> certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public Builder certificateId(@Nullable Integer certificateId) {
            this.certificateId = Codegen.ofNullable(certificateId);
            return this;
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
        public Builder expireTime(@Nullable Output<String> expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Builder expireTime(@Nullable String expireTime) {
            this.expireTime = Codegen.ofNullable(expireTime);
            return this;
        }
        public Builder managed(@Nullable Output<MangedSslCertificateManagedGetArgs> managed) {
            this.managed = managed;
            return this;
        }
        public Builder managed(@Nullable MangedSslCertificateManagedGetArgs managed) {
            this.managed = Codegen.ofNullable(managed);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
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
        public Builder subjectAlternativeNames(@Nullable Output<List<String>> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder subjectAlternativeNames(@Nullable List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = Codegen.ofNullable(subjectAlternativeNames);
            return this;
        }
        public Builder subjectAlternativeNames(String... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public MangedSslCertificateState build() {
            return new MangedSslCertificateState(certificateId, creationTimestamp, description, expireTime, managed, name, project, selfLink, subjectAlternativeNames, type);
        }
    }
}
