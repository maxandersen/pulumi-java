// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.helm.sh_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RepositoryOpts {
    private final @Nullable String caFile;
    private final @Nullable String certFile;
    private final @Nullable String keyFile;
    private final @Nullable String password;
    private final @Nullable String repo;
    private final @Nullable String username;

    @OutputCustomType.Constructor({"caFile","certFile","keyFile","password","repo","username"})
    private RepositoryOpts(
        @Nullable String caFile,
        @Nullable String certFile,
        @Nullable String keyFile,
        @Nullable String password,
        @Nullable String repo,
        @Nullable String username) {
        this.caFile = caFile;
        this.certFile = certFile;
        this.keyFile = keyFile;
        this.password = password;
        this.repo = repo;
        this.username = username;
    }

    public Optional<String> getCaFile() {
        return Optional.ofNullable(this.caFile);
    }
    public Optional<String> getCertFile() {
        return Optional.ofNullable(this.certFile);
    }
    public Optional<String> getKeyFile() {
        return Optional.ofNullable(this.keyFile);
    }
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    public Optional<String> getRepo() {
        return Optional.ofNullable(this.repo);
    }
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryOpts defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caFile;
        private @Nullable String certFile;
        private @Nullable String keyFile;
        private @Nullable String password;
        private @Nullable String repo;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryOpts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caFile = defaults.caFile;
    	      this.certFile = defaults.certFile;
    	      this.keyFile = defaults.keyFile;
    	      this.password = defaults.password;
    	      this.repo = defaults.repo;
    	      this.username = defaults.username;
        }

        public Builder setCaFile(@Nullable String caFile) {
            this.caFile = caFile;
            return this;
        }

        public Builder setCertFile(@Nullable String certFile) {
            this.certFile = certFile;
            return this;
        }

        public Builder setKeyFile(@Nullable String keyFile) {
            this.keyFile = keyFile;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setRepo(@Nullable String repo) {
            this.repo = repo;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public RepositoryOpts build() {
            return new RepositoryOpts(caFile, certFile, keyFile, password, repo, username);
        }
    }
}
