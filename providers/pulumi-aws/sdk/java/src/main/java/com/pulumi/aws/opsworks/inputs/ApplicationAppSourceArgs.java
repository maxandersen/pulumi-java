// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationAppSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationAppSourceArgs Empty = new ApplicationAppSourceArgs();

    /**
     * Password to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * For sources that are version-aware, the revision to use.
     * 
     */
    @Import(name="revision")
      private final @Nullable Output<String> revision;

    public Output<String> revision() {
        return this.revision == null ? Codegen.empty() : this.revision;
    }

    /**
     * SSH key to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
     * 
     */
    @Import(name="sshKey")
      private final @Nullable Output<String> sshKey;

    public Output<String> sshKey() {
        return this.sshKey == null ? Codegen.empty() : this.sshKey;
    }

    /**
     * The type of source to use. For example, &#34;archive&#34;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The URL where the app resource can be found.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> url() {
        return this.url == null ? Codegen.empty() : this.url;
    }

    /**
     * Username to use when authenticating to the source.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> username() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    public ApplicationAppSourceArgs(
        @Nullable Output<String> password,
        @Nullable Output<String> revision,
        @Nullable Output<String> sshKey,
        Output<String> type,
        @Nullable Output<String> url,
        @Nullable Output<String> username) {
        this.password = password;
        this.revision = revision;
        this.sshKey = sshKey;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = url;
        this.username = username;
    }

    private ApplicationAppSourceArgs() {
        this.password = Codegen.empty();
        this.revision = Codegen.empty();
        this.sshKey = Codegen.empty();
        this.type = Codegen.empty();
        this.url = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAppSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> password;
        private @Nullable Output<String> revision;
        private @Nullable Output<String> sshKey;
        private Output<String> type;
        private @Nullable Output<String> url;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationAppSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.revision = defaults.revision;
    	      this.sshKey = defaults.sshKey;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder revision(@Nullable Output<String> revision) {
            this.revision = revision;
            return this;
        }
        public Builder revision(@Nullable String revision) {
            this.revision = Codegen.ofNullable(revision);
            return this;
        }
        public Builder sshKey(@Nullable Output<String> sshKey) {
            this.sshKey = sshKey;
            return this;
        }
        public Builder sshKey(@Nullable String sshKey) {
            this.sshKey = Codegen.ofNullable(sshKey);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Codegen.ofNullable(url);
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Codegen.ofNullable(username);
            return this;
        }        public ApplicationAppSourceArgs build() {
            return new ApplicationAppSourceArgs(password, revision, sshKey, type, url, username);
        }
    }
}
