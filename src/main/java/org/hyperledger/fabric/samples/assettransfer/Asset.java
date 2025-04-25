/*
 * SPDX-License-Identifier: Apache-2.0
 */

package org.hyperledger.fabric.samples.assettransfer;

import java.util.Objects;

import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

import com.owlike.genson.annotation.JsonProperty;

@DataType()
public final class Asset {

    @Property()
    private final String assetID;


    @Property()
    private final String owner;

    @Property()
    private final String typeFile;
    @Property()
    private final String base64File;



    public String getAssetID() {
        return assetID;
    }

    public String getOwner() {
        return owner;
    }

    public String getBase64File() {
        return base64File;
    }

    public String getTypeFile() {
        return typeFile;
    }

    public Asset(@JsonProperty("assetID") final String assetID,
                 @JsonProperty("owner") final String owner,
                 @JsonProperty("typeFile") final String typeFile,
                 @JsonProperty("base64File") final String base64File) {
        this.assetID = assetID;
        this.owner = owner;
        this.base64File = base64File;
        this.typeFile = typeFile;
    }



    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        Asset other = (Asset) obj;

        return Objects.equals(getAssetID(), other.getAssetID()) && Objects.equals(getOwner(), other.getOwner()) && Objects.equals(getTypeFile(), other.getTypeFile()) && Objects.equals(getBase64File(), other.getBase64File());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAssetID(), getOwner(), getTypeFile(), getBase64File());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) +
                " [assetID=" + assetID + ", owner=" + owner + ", typeFile=" + typeFile + "]";
    }
}
