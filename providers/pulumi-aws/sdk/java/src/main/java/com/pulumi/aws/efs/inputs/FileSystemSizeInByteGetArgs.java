// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileSystemSizeInByteGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileSystemSizeInByteGetArgs Empty = new FileSystemSizeInByteGetArgs();

    /**
     * The latest known metered size (in bytes) of data stored in the file system.
     * 
     */
    @Import(name="value")
    private @Nullable Output<Integer> value;

    public Optional<Output<Integer>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
     * 
     */
    @Import(name="valueInIa")
    private @Nullable Output<Integer> valueInIa;

    public Optional<Output<Integer>> valueInIa() {
        return Optional.ofNullable(this.valueInIa);
    }

    /**
     * The latest known metered size (in bytes) of data stored in the Standard storage class.
     * 
     */
    @Import(name="valueInStandard")
    private @Nullable Output<Integer> valueInStandard;

    public Optional<Output<Integer>> valueInStandard() {
        return Optional.ofNullable(this.valueInStandard);
    }

    private FileSystemSizeInByteGetArgs() {}

    private FileSystemSizeInByteGetArgs(FileSystemSizeInByteGetArgs $) {
        this.value = $.value;
        this.valueInIa = $.valueInIa;
        this.valueInStandard = $.valueInStandard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileSystemSizeInByteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileSystemSizeInByteGetArgs $;

        public Builder() {
            $ = new FileSystemSizeInByteGetArgs();
        }

        public Builder(FileSystemSizeInByteGetArgs defaults) {
            $ = new FileSystemSizeInByteGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder value(@Nullable Output<Integer> value) {
            $.value = value;
            return this;
        }

        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public Builder valueInIa(@Nullable Output<Integer> valueInIa) {
            $.valueInIa = valueInIa;
            return this;
        }

        public Builder valueInIa(Integer valueInIa) {
            return valueInIa(Output.of(valueInIa));
        }

        public Builder valueInStandard(@Nullable Output<Integer> valueInStandard) {
            $.valueInStandard = valueInStandard;
            return this;
        }

        public Builder valueInStandard(Integer valueInStandard) {
            return valueInStandard(Output.of(valueInStandard));
        }

        public FileSystemSizeInByteGetArgs build() {
            return $;
        }
    }

}
