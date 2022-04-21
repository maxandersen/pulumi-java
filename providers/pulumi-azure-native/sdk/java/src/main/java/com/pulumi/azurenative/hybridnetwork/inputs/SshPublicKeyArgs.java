// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about SSH certificate public key and the path on the Linux VM where the public key is placed.
 * 
 */
public final class SshPublicKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SshPublicKeyArgs Empty = new SshPublicKeyArgs();

    /**
     * SSH public key certificate used to authenticate with the VM through ssh. The key needs to be at least 2048-bit and in ssh-rsa format. &lt;br&gt;&lt;br&gt; For creating ssh keys, see [Create SSH keys on Linux and Mac for Linux VMs in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-mac-create-ssh-keys?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     * 
     */
    @Import(name="keyData")
    private @Nullable Output<String> keyData;

    public Optional<Output<String>> keyData() {
        return Optional.ofNullable(this.keyData);
    }

    /**
     * Specifies the full path on the created VM where ssh public key is stored. If the file already exists, the specified key is appended to the file. Example: /home/user/.ssh/authorized_keys
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private SshPublicKeyArgs() {}

    private SshPublicKeyArgs(SshPublicKeyArgs $) {
        this.keyData = $.keyData;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshPublicKeyArgs $;

        public Builder() {
            $ = new SshPublicKeyArgs();
        }

        public Builder(SshPublicKeyArgs defaults) {
            $ = new SshPublicKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyData(@Nullable Output<String> keyData) {
            $.keyData = keyData;
            return this;
        }

        public Builder keyData(String keyData) {
            return keyData(Output.of(keyData));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public SshPublicKeyArgs build() {
            return $;
        }
    }

}
