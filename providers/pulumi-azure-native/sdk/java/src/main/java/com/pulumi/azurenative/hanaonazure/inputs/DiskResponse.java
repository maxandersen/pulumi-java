// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the disk information for the HANA instance
 * 
 */
public final class DiskResponse extends com.pulumi.resources.InvokeArgs {

    public static final DiskResponse Empty = new DiskResponse();

    /**
     * Specifies the size of an empty data disk in gigabytes.
     * 
     */
    @Import(name="diskSizeGB")
    private @Nullable Integer diskSizeGB;

    public Optional<Integer> diskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }

    /**
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
     */
    @Import(name="lun", required=true)
    private Integer lun;

    public Integer lun() {
        return this.lun;
    }

    /**
     * The disk name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private DiskResponse() {}

    private DiskResponse(DiskResponse $) {
        this.diskSizeGB = $.diskSizeGB;
        this.lun = $.lun;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskResponse $;

        public Builder() {
            $ = new DiskResponse();
        }

        public Builder(DiskResponse defaults) {
            $ = new DiskResponse(Objects.requireNonNull(defaults));
        }

        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            $.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder lun(Integer lun) {
            $.lun = lun;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public DiskResponse build() {
            $.lun = Objects.requireNonNull($.lun, "expected parameter 'lun' to be non-null");
            return $;
        }
    }

}
