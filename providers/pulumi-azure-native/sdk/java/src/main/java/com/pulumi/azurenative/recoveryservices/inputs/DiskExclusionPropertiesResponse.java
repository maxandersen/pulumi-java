// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskExclusionPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final DiskExclusionPropertiesResponse Empty = new DiskExclusionPropertiesResponse();

    /**
     * List of Disks' Logical Unit Numbers (LUN) to be used for VM Protection.
     * 
     */
    @Import(name="diskLunList")
      private final @Nullable List<Integer> diskLunList;

    public List<Integer> diskLunList() {
        return this.diskLunList == null ? List.of() : this.diskLunList;
    }

    /**
     * Flag to indicate whether DiskLunList is to be included/ excluded from backup.
     * 
     */
    @Import(name="isInclusionList")
      private final @Nullable Boolean isInclusionList;

    public Optional<Boolean> isInclusionList() {
        return this.isInclusionList == null ? Optional.empty() : Optional.ofNullable(this.isInclusionList);
    }

    public DiskExclusionPropertiesResponse(
        @Nullable List<Integer> diskLunList,
        @Nullable Boolean isInclusionList) {
        this.diskLunList = diskLunList;
        this.isInclusionList = isInclusionList;
    }

    private DiskExclusionPropertiesResponse() {
        this.diskLunList = List.of();
        this.isInclusionList = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskExclusionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Integer> diskLunList;
        private @Nullable Boolean isInclusionList;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskExclusionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskLunList = defaults.diskLunList;
    	      this.isInclusionList = defaults.isInclusionList;
        }

        public Builder diskLunList(@Nullable List<Integer> diskLunList) {
            this.diskLunList = diskLunList;
            return this;
        }
        public Builder diskLunList(Integer... diskLunList) {
            return diskLunList(List.of(diskLunList));
        }
        public Builder isInclusionList(@Nullable Boolean isInclusionList) {
            this.isInclusionList = isInclusionList;
            return this;
        }        public DiskExclusionPropertiesResponse build() {
            return new DiskExclusionPropertiesResponse(diskLunList, isInclusionList);
        }
    }
}
