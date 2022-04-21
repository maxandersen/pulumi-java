// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceAccount.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountKeyArgs Empty = new GetAccountKeyArgs();

    /**
     * The name of the service account key. This must have format
     * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{KEYID}`, where `{ACCOUNT}`
     * is the email address or unique id of the service account.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The ID of the project that the service account will be created in.
     * Defaults to the provider project configuration.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
     * 
     */
    @Import(name="publicKeyType")
    private @Nullable String publicKeyType;

    public Optional<String> publicKeyType() {
        return Optional.ofNullable(this.publicKeyType);
    }

    private GetAccountKeyArgs() {}

    private GetAccountKeyArgs(GetAccountKeyArgs $) {
        this.name = $.name;
        this.project = $.project;
        this.publicKeyType = $.publicKeyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountKeyArgs $;

        public Builder() {
            $ = new GetAccountKeyArgs();
        }

        public Builder(GetAccountKeyArgs defaults) {
            $ = new GetAccountKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder publicKeyType(@Nullable String publicKeyType) {
            $.publicKeyType = publicKeyType;
            return this;
        }

        public GetAccountKeyArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
