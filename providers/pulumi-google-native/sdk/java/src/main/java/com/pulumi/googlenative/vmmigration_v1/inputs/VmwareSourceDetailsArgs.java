// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VmwareSourceDetails message describes a specific source details for the vmware source type.
 * 
 */
public final class VmwareSourceDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmwareSourceDetailsArgs Empty = new VmwareSourceDetailsArgs();

    /**
     * Input only. The credentials password. This is write only and can not be read in a GET operation.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The thumbprint representing the certificate for the vcenter.
     * 
     */
    @Import(name="thumbprint")
      private final @Nullable Output<String> thumbprint;

    public Output<String> thumbprint() {
        return this.thumbprint == null ? Codegen.empty() : this.thumbprint;
    }

    /**
     * The credentials username.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> username() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    /**
     * The ip address of the vcenter this Source represents.
     * 
     */
    @Import(name="vcenterIp")
      private final @Nullable Output<String> vcenterIp;

    public Output<String> vcenterIp() {
        return this.vcenterIp == null ? Codegen.empty() : this.vcenterIp;
    }

    public VmwareSourceDetailsArgs(
        @Nullable Output<String> password,
        @Nullable Output<String> thumbprint,
        @Nullable Output<String> username,
        @Nullable Output<String> vcenterIp) {
        this.password = password;
        this.thumbprint = thumbprint;
        this.username = username;
        this.vcenterIp = vcenterIp;
    }

    private VmwareSourceDetailsArgs() {
        this.password = Codegen.empty();
        this.thumbprint = Codegen.empty();
        this.username = Codegen.empty();
        this.vcenterIp = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareSourceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> password;
        private @Nullable Output<String> thumbprint;
        private @Nullable Output<String> username;
        private @Nullable Output<String> vcenterIp;

        public Builder() {
    	      // Empty
        }

        public Builder(VmwareSourceDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.thumbprint = defaults.thumbprint;
    	      this.username = defaults.username;
    	      this.vcenterIp = defaults.vcenterIp;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = Codegen.ofNullable(thumbprint);
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Codegen.ofNullable(username);
            return this;
        }
        public Builder vcenterIp(@Nullable Output<String> vcenterIp) {
            this.vcenterIp = vcenterIp;
            return this;
        }
        public Builder vcenterIp(@Nullable String vcenterIp) {
            this.vcenterIp = Codegen.ofNullable(vcenterIp);
            return this;
        }        public VmwareSourceDetailsArgs build() {
            return new VmwareSourceDetailsArgs(password, thumbprint, username, vcenterIp);
        }
    }
}
