// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.oslogin_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSshPublicKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSshPublicKeyArgs Empty = new GetSshPublicKeyArgs();

    @Import(name="sshPublicKeyId", required=true)
    private String sshPublicKeyId;

    public String sshPublicKeyId() {
        return this.sshPublicKeyId;
    }

    @Import(name="userId", required=true)
    private String userId;

    public String userId() {
        return this.userId;
    }

    private GetSshPublicKeyArgs() {}

    private GetSshPublicKeyArgs(GetSshPublicKeyArgs $) {
        this.sshPublicKeyId = $.sshPublicKeyId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSshPublicKeyArgs $;

        public Builder() {
            $ = new GetSshPublicKeyArgs();
        }

        public Builder(GetSshPublicKeyArgs defaults) {
            $ = new GetSshPublicKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder sshPublicKeyId(String sshPublicKeyId) {
            $.sshPublicKeyId = sshPublicKeyId;
            return this;
        }

        public Builder userId(String userId) {
            $.userId = userId;
            return this;
        }

        public GetSshPublicKeyArgs build() {
            $.sshPublicKeyId = Objects.requireNonNull($.sshPublicKeyId, "expected parameter 'sshPublicKeyId' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
