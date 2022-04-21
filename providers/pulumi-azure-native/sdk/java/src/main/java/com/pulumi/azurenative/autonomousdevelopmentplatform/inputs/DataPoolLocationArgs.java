// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.autonomousdevelopmentplatform.inputs;

import com.pulumi.azurenative.autonomousdevelopmentplatform.inputs.DataPoolEncryptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Location of a Data Pool
 * 
 */
public final class DataPoolLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataPoolLocationArgs Empty = new DataPoolLocationArgs();

    /**
     * Encryption properties of a Data Pool location
     * 
     */
    @Import(name="encryption")
    private @Nullable Output<DataPoolEncryptionArgs> encryption;

    public Optional<Output<DataPoolEncryptionArgs>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * The location name
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private DataPoolLocationArgs() {}

    private DataPoolLocationArgs(DataPoolLocationArgs $) {
        this.encryption = $.encryption;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataPoolLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataPoolLocationArgs $;

        public Builder() {
            $ = new DataPoolLocationArgs();
        }

        public Builder(DataPoolLocationArgs defaults) {
            $ = new DataPoolLocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder encryption(@Nullable Output<DataPoolEncryptionArgs> encryption) {
            $.encryption = encryption;
            return this;
        }

        public Builder encryption(DataPoolEncryptionArgs encryption) {
            return encryption(Output.of(encryption));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DataPoolLocationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
